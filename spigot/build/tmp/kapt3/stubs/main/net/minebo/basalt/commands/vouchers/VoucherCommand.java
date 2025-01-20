package net.minebo.basalt.commands.vouchers;

@co.aikar.commands.annotation.CommandAlias(value = "voucher|vouchers")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J$\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007J$\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u000eH\u0007J.\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u000eH\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u0017"}, d2 = {"Lnet/minebo/basalt/commands/vouchers/VoucherCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "openMenu", "", "player", "Lorg/bukkit/entity/Player;", "help", "Lco/aikar/commands/CommandHelp;", "create", "sender", "Lorg/bukkit/command/CommandSender;", "id", "", "prize", "setcommand", "command", "issue", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "duration", "delete", "spigot"})
public final class VoucherCommand extends co.aikar.commands.BaseCommand {
    
    public VoucherCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.Default()
    public final void openMenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "help")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.vouchers.admin")
    @co.aikar.commands.annotation.HelpCommand()
    public final void help(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.CommandHelp help) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "template setprize")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.vouchers.admin")
    public final void create(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id, @co.aikar.commands.annotation.Name(value = "prize")
    @org.jetbrains.annotations.NotNull()
    java.lang.String prize) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "template setcommand")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.vouchers.admin")
    public final void setcommand(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id, @co.aikar.commands.annotation.Name(value = "command")
    @org.jetbrains.annotations.NotNull()
    java.lang.String command) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "issue")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.vouchers.admin")
    public final void issue(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target, @co.aikar.commands.annotation.Name(value = "duration")
    @org.jetbrains.annotations.NotNull()
    java.lang.String duration) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "template create")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.vouchers.admin")
    public final void create(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "template delete")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.vouchers.admin")
    public final void delete(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}