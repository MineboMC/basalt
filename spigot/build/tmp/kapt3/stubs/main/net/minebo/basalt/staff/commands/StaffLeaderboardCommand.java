package net.minebo.basalt.staff.commands;

/**
 * Class created on 9/16/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J4\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a8\u0006\u0016"}, d2 = {"Lnet/minebo/basalt/staff/commands/StaffLeaderboardCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "staffLeaderboard", "Ljava/util/concurrent/CompletableFuture;", "Ljava/lang/Void;", "player", "Lorg/bukkit/entity/Player;", "exclusivelyLoadEntries", "", "", "Lnet/minebo/basalt/util/menu/Button;", "types", "", "Lnet/minebo/basalt/punishments/PunishmentType;", "users", "", "Lnet/minebo/basalt/models/profile/GameProfile;", "fetchFirst10Entries", "type", "toPickFrom", "spigot"})
public final class StaffLeaderboardCommand extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.staff.commands.StaffLeaderboardCommand INSTANCE = null;
    
    private StaffLeaderboardCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "staffleaderboard")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.staff.leaderboards")
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> staffLeaderboard(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button>> exclusivelyLoadEntries(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends net.minebo.basalt.punishments.PunishmentType> types, @org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.models.profile.GameProfile> users) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.models.profile.GameProfile> fetchFirst10Entries(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.PunishmentType type, @org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.models.profile.GameProfile> toPickFrom) {
        return null;
    }
}