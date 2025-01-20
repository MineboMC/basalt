package net.minebo.basalt.grants.view;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/grants/view/GrantsCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "grants", "Ljava/util/concurrent/CompletableFuture;", "Ljava/lang/Void;", "player", "Lorg/bukkit/entity/Player;", "gameProfile", "Lnet/minebo/basalt/profiles/AsyncGameProfile;", "getViewableGrants", "", "Lnet/minebo/basalt/models/grant/types/RankGrant;", "spigot"})
public final class GrantsCommand extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.grants.view.GrantsCommand INSTANCE = null;
    
    private GrantsCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "grants")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.grants.admin")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> grants(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.profiles.AsyncGameProfile gameProfile) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.models.grant.types.RankGrant> getViewableGrants(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.models.grant.types.RankGrant> grants) {
        return null;
    }
}