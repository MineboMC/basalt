package net.minebo.basalt.punishment.commands.remove;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lnet/minebo/basalt/punishment/commands/remove/UnmuteCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "ban", "", "sender", "Lorg/bukkit/command/CommandSender;", "gameProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "reason", "", "spigot"})
public final class UnmuteCommand extends co.aikar.commands.BaseCommand {
    
    public UnmuteCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "unmute|unm")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.punishments.unmute")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    public final void ban(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile, @co.aikar.commands.annotation.Name(value = "reason")
    @org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
    }
}