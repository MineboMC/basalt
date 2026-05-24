package net.minebo.basalt.velocity

import org.spongepowered.configurate.yaml.YamlConfigurationLoader
import java.nio.file.Path

object BasaltConfigIo {

    fun load(path: Path): net.minebo.basalt.velocity.BasaltConfig {
        val loader = YamlConfigurationLoader.builder().path(path).build()
        val root = loader.load()

        val mongoNode = root.node("mongo")
        val redisNode = root.node("redis")
        val motdNode = root.node("motd")
        val whitelistNode = root.node("whitelist")

        return BasaltConfig(
            mongo = BasaltConfig.MongoSection(
                host = mongoNode.node("host").getString("127.0.0.1"),
                port = mongoNode.node("port").getInt(27017),
                authDB = mongoNode.node("authDB").getString("admin"),
                password = mongoNode.node("password").getString(""),
                username = mongoNode.node("username").getString(""),
                database = mongoNode.node("database").getString("Basalt"),
                auth = mongoNode.node("auth").getBoolean(false)
            ),
            uri = root.node("uri").getString(""),
            redis = BasaltConfig.RedisSection(
                host = redisNode.node("host").getString("127.0.0.1"),
                port = redisNode.node("port").getInt(6379),
                username = redisNode.node("username").getString(""),
                password = redisNode.node("password").getString("")
            ),
            motd = BasaltConfig.MotdSection(
                normal = motdNode.node("normal").getList(String::class.java, listOf("Welcome to the server!", "Enjoy your stay.")),
                whitelist = motdNode.node("whitelist").getList(String::class.java, listOf("Server is currently whitelisted.", "Please try again later."))
            ),
            whitelist = BasaltConfig.WhitelistSection(
                enabled = whitelistNode.node("enabled").getBoolean(true),
                `kick-message` = whitelistNode.node("kick-message").getList(String::class.java, listOf("&cYou are not whitelisted.")),
                uuids = whitelistNode.node("uuids").getList(String::class.java, listOf("15f0316d-84f0-404f-84ff-19fae1a0d289"))
            )
        )
    }

    fun save(config: BasaltConfig, path: Path) {
        val loader = YamlConfigurationLoader.builder().path(path).build()
        val root = loader.createNode()

        val mongoNode = root.node("mongo")
        mongoNode.node("host").set(config.mongo.host)
        mongoNode.node("port").set(config.mongo.port)
        mongoNode.node("authDB").set(config.mongo.authDB)
        mongoNode.node("password").set(config.mongo.password)
        mongoNode.node("username").set(config.mongo.username)
        mongoNode.node("database").set(config.mongo.database)
        mongoNode.node("auth").set(config.mongo.auth)

        root.node("uri").set(config.uri)

        val redisNode = root.node("redis")
        redisNode.node("host").set(config.redis.host)
        redisNode.node("port").set(config.redis.port)
        redisNode.node("username").set(config.redis.username)
        redisNode.node("password").set(config.redis.password)

        val motdNode = root.node("motd")
        motdNode.node("normal").setList(String::class.java, config.motd.normal)
        motdNode.node("whitelist").setList(String::class.java, config.motd.whitelist)

        val whitelistNode = root.node("whitelist")
        whitelistNode.node("enabled").set(config.whitelist.enabled)
        whitelistNode.node("kick-message").setList(String::class.java, config.whitelist.`kick-message`)
        whitelistNode.node("uuids").setList(String::class.java, config.whitelist.uuids)

        loader.save(root)
    }
}