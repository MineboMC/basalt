package net.minebo.basalt.velocity

data class BasaltConfig(
    val mongo: MongoSection = MongoSection(),
    val uri: String = "",
    val redis: RedisSection = RedisSection(),
    val motd: MotdSection = MotdSection(),
    val whitelist: WhitelistSection = WhitelistSection()
) {
    data class MongoSection(
        val host: String = "127.0.0.1",
        val port: Int = 27017,
        val authDB: String = "admin",
        val password: String = "",
        val username: String = "",
        val database: String = "Basalt",
        val auth: Boolean = false
    )

    data class RedisSection(
        val host: String = "127.0.0.1",
        val port: Int = 6379,
        val username: String = "",
        val password: String = ""
    )

    data class MotdSection(
        val normal: List<String> = listOf(
            "Welcome to the server!",
            "Enjoy your stay."
        ),
        val whitelist: List<String> = listOf(
            "Server is currently whitelisted.",
            "Please try again later."
        )
    )

    data class WhitelistSection(
        val enabled: Boolean = true,
        val `kick-message`: List<String> = listOf("&cYou are not whitelisted."),
        val uuids: List<String> = listOf("15f0316d-84f0-404f-84ff-19fae1a0d289")
    )

    companion object {
        fun defaults(): BasaltConfig = BasaltConfig()
    }
}