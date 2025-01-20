package ltd.matrixstudios.discord


import io.github.nosequel.data.connection.mongo.URIMongoConnectionPool
import net.minebo.basalt.Basalt
import ltd.matrixstudios.discord.configuration.ConfigurationService
import ltd.matrixstudios.discord.links.DownloadBasaltCommand
import ltd.matrixstudios.discord.sync.SyncCommand
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.interactions.commands.OptionType
import net.dv8tion.jda.api.interactions.commands.build.Commands
import net.dv8tion.jda.api.utils.cache.CacheFlag

class BasaltDiscordBot
{

    companion object
    {
        lateinit var instance: BasaltDiscordBot
        lateinit var jda: JDA

        @JvmStatic
        fun main(args: Array<String>)
        {
            instance = BasaltDiscordBot()

            instance.start(args[0])
        }
    }

    private val commands = listOf(
        DownloadBasaltCommand,
        SyncCommand
    )

    fun start(token: String)
    {
        val builder = JDABuilder.createDefault(token)
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE)
        builder.setBulkDeleteSplittingEnabled(false)
        builder.setActivity(Activity.watching("Basalt Error Logs"))
        builder.setAutoReconnect(true)
        jda = builder.build()

        ConfigurationService.load()

        jda.updateCommands().addCommands(
            Commands.slash("download-basalt", "Find the links where you can download Basalt."),
            Commands.slash("sync", "Sync your in-game rank with your Discord rank.")
                .addOption(
                    OptionType.STRING,
                    "username",
                    "The username of the account that you synced on",
                    true
                )
                .addOption(
                    OptionType.STRING,
                    "sync-code",
                    "The code that you receive in-game when you execute the sync command",
                    true
                )
        ).queue()

        commands.forEach {
            jda.addEventListener(it)
        }

        Basalt.start(
            true,
            URIMongoConnectionPool().apply {
                this.uri = ConfigurationService.configuration.getMongoURI()
                this.databaseName = "Basalt"
            },
            false,
            "127.0.0.1",
            6739,
            null,
            null
        )

        jda.awaitReady()
    }
}