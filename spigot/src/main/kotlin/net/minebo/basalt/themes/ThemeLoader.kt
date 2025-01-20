package net.minebo.basalt.themes

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.themes.types.*

object ThemeLoader
{
    var themes = mutableMapOf<String, Theme>()

    lateinit var defaultTheme: Theme

    fun loadAllThemes()
    {
        themes["MMC"] = MMC()
        themes["hydrogen"] = Hydrogen()
        themes["neutron"] = Neutron()
        themes["mcore"] = mCore()
        themes["custom"] = Custom()

        val config = BasaltSpigotPlugin.instance.config

        val theme = config.getString("defaultTheme")

        val foundTheme = themes.getOrDefault(theme, MMC())

        this.defaultTheme = foundTheme
    }

    fun setFallbackTheme(theme: Theme)
    {
        defaultTheme = theme

        val config = BasaltSpigotPlugin.instance.config
        config.set("defaultTheme", theme.id)

        BasaltSpigotPlugin.instance.saveConfig()
    }
}