package net.minebo.basalt.vault

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.vault.permission.VaultPermissionExtension

object VaultHookManager
{
    private var using = false

    fun loadVault()
    {
        if (BasaltSpigotPlugin.instance.server.pluginManager.getPlugin("Vault") != null)
        {
            using = true

            val prov = VaultPermissionExtension()
            prov.init()
            net.minebo.basalt.util.Chat.sendConsoleMessage("&6[Vault] &fPermission Hook: &aTrue")
            net.minebo.basalt.util.Chat.sendConsoleMessage("&6[Vault] &fChat Hook: &aTrue")
        }

    }
}