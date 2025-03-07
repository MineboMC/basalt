package net.minebo.basalt.aikar

import co.aikar.commands.BukkitMessageFormatter
import co.aikar.commands.MessageType
import co.aikar.commands.PaperCommandManager
import co.aikar.commands.bukkit.contexts.OnlinePlayer
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.aikar.context.*
import net.minebo.basalt.broadcasts.commands.AutoBroadcastCommands
import net.minebo.basalt.chatcolors.ChatColorLoader
import net.minebo.basalt.chatcolors.commands.ChatColorCommands
import net.minebo.basalt.commands.admin.AdminChatCommand
import net.minebo.basalt.commands.admin.panel.AdminPanelCommand
import net.minebo.basalt.commands.alts.AltsCommand
import net.minebo.basalt.commands.alts.IpReportCommand
import net.minebo.basalt.commands.branding.BasaltCommand
import net.minebo.basalt.commands.coins.CoinShopCommand
import net.minebo.basalt.commands.coins.CoinShopManager
import net.minebo.basalt.commands.coins.CoinsCommand
import net.minebo.basalt.commands.filter.FilterCommands
import net.minebo.basalt.commands.metrics.MetricCommand
import net.minebo.basalt.commands.notes.PlayerNotesCommands
import net.minebo.basalt.commands.rank.GenericRankCommands
import net.minebo.basalt.commands.sessions.SessionCommands
import net.minebo.basalt.commands.sync.DiscordSyncCommands
import net.minebo.basalt.commands.tags.TagAdminCommand
import net.minebo.basalt.commands.tags.TagCommand
import net.minebo.basalt.commands.tags.grants.TagGrantCommand
import net.minebo.basalt.commands.tags.grants.TagGrantsCommand
import net.minebo.basalt.commands.uuid.UUIDCacheCommands
import net.minebo.basalt.commands.vouchers.VoucherCommand
import net.minebo.basalt.convert.luckperms.LuckPermsConverterCommand
import net.minebo.basalt.disguise.commands.RankDisguiseCommand
import net.minebo.basalt.friends.commands.FriendCommands
import net.minebo.basalt.grants.apply.CGrantCommand
import net.minebo.basalt.grants.apply.GrantCommand
import net.minebo.basalt.grants.apply.NonModelGrantCommand
import net.minebo.basalt.grants.configure.GrantConfigureCommand
import net.minebo.basalt.grants.view.AuditCommand
import net.minebo.basalt.grants.view.GrantHistoryCommand
import net.minebo.basalt.grants.view.GrantsCommand
import net.minebo.basalt.models.grant.types.scope.GrantScope
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.models.ranks.scope.RankScope
import net.minebo.basalt.profiles.AsyncGameProfile
import net.minebo.basalt.profiles.commands.player.LookupCommand
import net.minebo.basalt.profiles.commands.player.WipeGrantsCommand
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.queue.command.ModifyQueueCommands
import net.minebo.basalt.queue.command.QueueCommands
import net.minebo.basalt.redis.command.RedisCommand
import net.minebo.basalt.servers.commands.BroadcastCommand
import net.minebo.basalt.themes.commands.ThemeSelectCommand
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.enchantments.Enchantment
import java.util.*

object ACFCommandController
{

    private val config = BasaltSpigotPlugin.instance.config

    fun registerAll()
    {
        BasaltSpigotPlugin.instance.commandManager = PaperCommandManager(BasaltSpigotPlugin.instance).apply {

            this.commandContexts.registerContext(GameProfile::class.java, GameProfileContextResolver())
            this.commandContexts.registerContext(Rank::class.java, RankContextResolver())
            this.commandContexts.registerContext(PunishmentType::class.java, PunishmentTypeResolver())
            this.commandContexts.registerContext(UUID::class.java, UUIDContextResolver())
            this.commandContexts.registerContext(GrantScope::class.java, GrantScopeContextResolver())
            this.commandContexts.registerContext(AsyncGameProfile::class.java, AsyncProfileResolver())
            this.commandContexts.registerContext(RankScope::class.java, RankScopeResolver())
            this.commandContexts.registerContext(OnlinePlayer::class.java, OnlinePlayerResolver())

            this.commandCompletions.registerCompletion("enchantments") {
                return@registerCompletion Enchantment.values().map { it.name }.toList()
            }

            this.commandCompletions.registerCompletion("gameprofile") {
                return@registerCompletion BasaltSpigotPlugin.instance.server.onlinePlayers.map { it.name }.toList()
            }

            this.enableUnstableAPI("help")

            this.setFormat(
                MessageType.SYNTAX,
                BukkitMessageFormatter(ChatColor.YELLOW, ChatColor.GOLD, ChatColor.WHITE)
            )
            this.setFormat(MessageType.HELP, BukkitMessageFormatter(ChatColor.GOLD, ChatColor.YELLOW, ChatColor.GRAY))

            if (config.getBoolean("modules.ranks"))
            {
                registerCommand(GenericRankCommands())
                registerCommand(GrantCommand())
                registerCommand(GrantsCommand)
                registerCommand(CGrantCommand())
                registerCommand(GrantConfigureCommand())
                registerCommand(NonModelGrantCommand())
                registerCommand(GrantHistoryCommand())
                if (Bukkit.getServer().pluginManager.isPluginEnabled("LuckPerms"))
                {
                    registerCommand(LuckPermsConverterCommand())
                }
                registerCommand(WipeGrantsCommand)
            }

            registerCommand(AdminPanelCommand())
            registerCommand(RedisCommand)
            registerCommand(AutoBroadcastCommands)

            if (config.getBoolean("modules.vouchers"))
            {
                registerCommand(VoucherCommand())
            }

            registerCommand(BroadcastCommand)

            if (config.getBoolean("modules.coins"))
            {
                registerCommand(CoinsCommand())
                registerCommand(CoinShopCommand())
                CoinShopManager.loadCoinShopAssets()
            }

            if (config.getBoolean("modules.themeCommands"))
            {
                registerCommand(ThemeSelectCommand())
            }

            if (BasaltSpigotPlugin.instance.config.getBoolean("modules.queue"))
            {
                registerCommand(QueueCommands())
                registerCommand(ModifyQueueCommands())
            }

            registerCommand(RankDisguiseCommand())

            registerCommand(UUIDCacheCommands)


            registerCommand(BasaltCommand())

            if (config.getBoolean("modules.chatcolors"))
            {
                ChatColorLoader.loadAllChatColors()
                registerCommand(ChatColorCommands())
            }

            registerCommand(DiscordSyncCommands)
            registerCommand(AuditCommand)

            registerCommand(AltsCommand())
            registerCommand(IpReportCommand())

            if (config.getBoolean("modules.notes"))
            {
                registerCommand(PlayerNotesCommands())
            }

            if (config.getBoolean("modules.prefixes"))
            {
                registerCommand(TagAdminCommand())
                registerCommand(TagCommand())
                registerCommand(TagGrantCommand())
                registerCommand(TagGrantsCommand())
            }


            if (config.getBoolean("modules.filters"))
            {
                registerCommand(FilterCommands(), true)
            }

            if (config.getBoolean("modules.friends"))
            {
                registerCommand(FriendCommands(), true)
            }

            registerCommand(AdminChatCommand())

            registerCommand(MetricCommand())

            registerCommand(SessionCommands())

            registerCommand(LookupCommand())
        }

    }
}