package net.minebo.basalt.commands.tags.grants;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J8\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000eH\u0007\u00a8\u0006\u0011"}, d2 = {"Lnet/minebo/basalt/commands/tags/grants/TagGrantCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "tagGrant", "", "player", "Lorg/bukkit/entity/Player;", "gameProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "manual", "sender", "Lorg/bukkit/command/CommandSender;", "tag", "", "duration", "reason", "spigot"})
public final class TagGrantCommand extends co.aikar.commands.BaseCommand {
    
    public TagGrantCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "taggrant|prefixgrant")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.tags.admin")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    public final void tagGrant(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "manualtaggrant|manaulprefixgrant")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.tags.admin")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    public final void manual(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile, @co.aikar.commands.annotation.Name(value = "tag")
    @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @co.aikar.commands.annotation.Name(value = "duration")
    @org.jetbrains.annotations.NotNull()
    java.lang.String duration, @co.aikar.commands.annotation.Name(value = "reason")
    @org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
    }
}