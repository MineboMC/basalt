package net.minebo.basalt.profiles.permissions.command;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000bH\u0007J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J$\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000bH\u0007\u00a8\u0006\u0011"}, d2 = {"Lnet/minebo/basalt/profiles/permissions/command/PermissionEditCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "manualPermEdit", "", "sender", "Lorg/bukkit/command/CommandSender;", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "perm", "", "scope", "duration", "onListPermission", "onDeletePermission", "node", "spigot"})
public final class PermissionEditCommands extends co.aikar.commands.BaseCommand {
    
    public PermissionEditCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "addpermission|addperm")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.command.addpermission")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    public final void manualPermEdit(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target, @co.aikar.commands.annotation.Name(value = "permission")
    @org.jetbrains.annotations.NotNull()
    java.lang.String perm, @co.aikar.commands.annotation.Name(value = "scope")
    @org.jetbrains.annotations.NotNull()
    java.lang.String scope, @co.aikar.commands.annotation.Name(value = "duration")
    @org.jetbrains.annotations.NotNull()
    java.lang.String duration) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "listpermissions|listperms")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.command.listpermissions")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    public final void onListPermission(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "deletepermission|delperm")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.command.deletepermission")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    public final void onDeletePermission(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target, @co.aikar.commands.annotation.Name(value = "node")
    @org.jetbrains.annotations.NotNull()
    java.lang.String node) {
    }
}