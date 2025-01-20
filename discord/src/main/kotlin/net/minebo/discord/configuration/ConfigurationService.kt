package ltd.matrixstudios.discord.configuration

import ltd.matrixstudios.amber.AmberConfigurationService
import ltd.matrixstudios.discord.BasaltDiscordBot
import java.io.File


object ConfigurationService
{
    lateinit var configuration: DiscordBotConfiguration

    fun load()
    {
        AmberConfigurationService.make(
            File(BasaltDiscordBot::class.java
                .getProtectionDomain()
                .codeSource
                .location
                .toURI()
            ).parentFile.path,
            "net.minebo.discord",
            false
        )

        configuration = AmberConfigurationService.from(DiscordBotConfiguration::class.java, "bot-config.yml")
    }
}