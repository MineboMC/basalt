package net.minebo.basalt.commands.rank;

@co.aikar.commands.annotation.CommandAlias(value = "rank")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006H\u0007J\u001a\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0007J$\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\u0014\u001a\u00020\u0010H\u0007J\u001a\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u000bH\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J$\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\u0010H\u0007J$\u0010\u0019\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u001a\u001a\u00020\u0010H\u0007J$\u0010\u001b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u001c\u001a\u00020\u001dH\u0007J$\u0010\u001e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u001f\u001a\u00020\u0010H\u0007J$\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020\u000bH\u0007J$\u0010\"\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020\u000bH\u0007J$\u0010#\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010$\u001a\u00020\u0010H\u0007J$\u0010%\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010$\u001a\u00020\u0010H\u0007J$\u0010&\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010'\u001a\u00020\u0010H\u0007J$\u0010(\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010)\u001a\u00020*H\u0007J$\u0010+\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010,\u001a\u00020*H\u0007J$\u0010-\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010.\u001a\u00020/H\u0007J$\u00100\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u00101\u001a\u00020\u0010H\u0007\u00a8\u00062"}, d2 = {"Lnet/minebo/basalt/commands/rank/GenericRankCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "help", "", "Lco/aikar/commands/CommandHelp;", "scan", "player", "Lorg/bukkit/entity/Player;", "rank", "Lnet/minebo/basalt/models/ranks/Rank;", "create", "sender", "Lorg/bukkit/command/CommandSender;", "name", "", "list", "setDiscordId", "foundRank", "discordRoleId", "deleteDiscordId", "delete", "setRankPrefix", "newPrefix", "setRankColor", "newColor", "setRankWeight", "newWeight", "", "setRankWoolColor", "newWoolColor", "addRankParent", "parentRank", "removeRankParent", "addRankPermission", "permission", "removeRankPermission", "setRankDisplayName", "newDisplayName", "setRankDefaultState", "newDefaultState", "", "setRankStaffState", "newStaffState", "setRankScope", "rankScope", "Lnet/minebo/basalt/models/ranks/scope/RankScope;", "renameRank", "id", "spigot"})
public final class GenericRankCommands extends co.aikar.commands.BaseCommand {
    
    public GenericRankCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.HelpCommand()
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    @co.aikar.commands.annotation.Description(value = "Display the help syntax.")
    public final void help(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.CommandHelp help) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "scan")
    @co.aikar.commands.annotation.Description(value = "Scan all available profiles to find people with a certain rank")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    public final void scan(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "create")
    @co.aikar.commands.annotation.Description(value = "Create a new rank")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    public final void create(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "list|editor")
    @co.aikar.commands.annotation.Description(value = "View a list of ranks and edit them")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    public final void list(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "set-discord-id")
    @co.aikar.commands.annotation.Description(value = "Set Discord role ID for a rank.")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    public final void setDiscordId(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank foundRank, @co.aikar.commands.annotation.Name(value = "role ID")
    @org.jetbrains.annotations.NotNull()
    java.lang.String discordRoleId) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "delete-discord-id")
    @co.aikar.commands.annotation.Description(value = "Delete Discord role ID for a rank.")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    public final void deleteDiscordId(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank foundRank) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "delete")
    @co.aikar.commands.annotation.Description(value = "Delete a rank with a given name")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    public final void delete(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank) {
    }
    
    /**
     * Removed in favor of using the /rank list menu instead.
     * Keeping the code in here in case 98ping wishes to revert back to the old system.
     *
     * @Subcommand("info")
     * @Description("Show detailed information about a rank")
     *    @CommandPermission("rank.admin")
     *    fun info(sender: CommandSender, @Name("rank") rank: Rank)
     *    {
     *        sender.sendMessage(Chat.format("&7&m--------------------------"))
     *        sender.sendMessage(Chat.format(rank.color + rank.displayName + " &7❘ &fInformation"))
     *        sender.sendMessage(Chat.format("&7&m--------------------------"))
     *        sender.sendMessage(Chat.format("&6Weight: &f" + rank.weight))
     *        sender.sendMessage(Chat.format("&6Prefix: &f" + rank.prefix))
     *        sender.sendMessage(Chat.format("&6Color: " + rank.color + "This"))
     *        sender.sendMessage(Chat.format("&6Permissions: &f" + rank.permissions.toString()))
     *        sender.sendMessage(Chat.format("&6Staff Rank: &f" + rank.staff))
     *        sender.sendMessage(Chat.format("&6Default Rank: &f" + rank.default))
     *        sender.sendMessage(
     *            Chat.format(
     *                "&6Scopes: &f" + if (rank.getRankScope().global) "Global" else rank.getRankScope().servers.joinToString(
     *                    ", "
     *                )
     *            )
     *        )
     *        sender.sendMessage(" ")
     *        sender.sendMessage(Chat.format("&6Parents &7(${rank.parents.size}):"))
     *        val parents = rank.parents.map { RankService.byId(it) }.filterNotNull()
     *
     *        for (rank2 in parents)
     *        {
     *            sender.sendMessage(Chat.format("&7• &r" + rank2.color + rank2.displayName))
     *        }
     *        sender.sendMessage(Chat.format("&7&m--------------------------"))
     *
     *    @Subcommand("editor|list")
     *    @Description("Open the rank editor menu")
     *    @CommandPermission("rank.admin")
     *    fun editor(player: Player)
     *    {
     *        RankEditor(player).updateMenu()
     *    }
     */
    @co.aikar.commands.annotation.Subcommand(value = "setprefix|prefix")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    @co.aikar.commands.annotation.Description(value = "Set the prefix of a rank")
    public final void setRankPrefix(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @co.aikar.commands.annotation.Name(value = "prefix")
    @org.jetbrains.annotations.NotNull()
    java.lang.String newPrefix) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "setcolor|color")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    @co.aikar.commands.annotation.Description(value = "Set the color of a rank")
    public final void setRankColor(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @co.aikar.commands.annotation.Single()
    @co.aikar.commands.annotation.Name(value = "color")
    @org.jetbrains.annotations.NotNull()
    java.lang.String newColor) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "setweight|weight")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    @co.aikar.commands.annotation.Description(value = "Set the weight of a rank")
    public final void setRankWeight(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @co.aikar.commands.annotation.Name(value = "weight")
    int newWeight) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "setwoolcolor|woolcolor")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    @co.aikar.commands.annotation.Description(value = "Set the wool color of a rank")
    public final void setRankWoolColor(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @co.aikar.commands.annotation.Name(value = "wool color")
    @org.jetbrains.annotations.NotNull()
    java.lang.String newWoolColor) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "parent|inherit add")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    @co.aikar.commands.annotation.Description(value = "Add a parent to a rank")
    public final void addRankParent(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @co.aikar.commands.annotation.Name(value = "parent")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank parentRank) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "parent|inherit remove")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    @co.aikar.commands.annotation.Description(value = "Remove a parent from a rank")
    public final void removeRankParent(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @co.aikar.commands.annotation.Name(value = "parent")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank parentRank) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "permission|perm add")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    @co.aikar.commands.annotation.Description(value = "Add a permission to a rank")
    public final void addRankPermission(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @co.aikar.commands.annotation.Name(value = "permission")
    @org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "permission|perm remove")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    @co.aikar.commands.annotation.Description(value = "Remove a permission from a rank")
    public final void removeRankPermission(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @co.aikar.commands.annotation.Name(value = "permission")
    @org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "setdisplayname|displayname")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    @co.aikar.commands.annotation.Description(value = "Set the display name of a rank")
    public final void setRankDisplayName(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @co.aikar.commands.annotation.Name(value = "display name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String newDisplayName) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "setdefault|default")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    @co.aikar.commands.annotation.Description(value = "Change whether a rank is the default rank")
    public final void setRankDefaultState(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @co.aikar.commands.annotation.Name(value = "state")
    boolean newDefaultState) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "setstaff|staff")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    @co.aikar.commands.annotation.Description(value = "Change whether a rank is a staff rank")
    public final void setRankStaffState(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @co.aikar.commands.annotation.Name(value = "state")
    boolean newStaffState) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "setscope|scope")
    @co.aikar.commands.annotation.Description(value = "Set the servers that a rank will be visible and applicable to")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    public final void setRankScope(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @co.aikar.commands.annotation.Name(value = "scope")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.scope.RankScope rankScope) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "rename|rename-id")
    @co.aikar.commands.annotation.Description(value = "Change the ID of a rank")
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    public final void renameRank(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "rank")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @co.aikar.commands.annotation.Name(value = "new name")
    @co.aikar.commands.annotation.Single()
    @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}