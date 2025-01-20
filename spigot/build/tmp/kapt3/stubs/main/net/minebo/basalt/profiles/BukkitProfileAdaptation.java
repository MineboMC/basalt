package net.minebo.basalt.profiles;

/**
 * Class created on 5/27/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lnet/minebo/basalt/profiles/BukkitProfileAdaptation;", "", "<init>", "()V", "backingCacheIpStore", "", "Ljava/util/UUID;", "", "getBackingCacheIpStore", "()Ljava/util/Map;", "loadAllEvents", "", "initializeGrant", "rankGrant", "Lnet/minebo/basalt/models/grant/types/RankGrant;", "uuid", "playerNeedsAuthenticating", "", "profile", "Lnet/minebo/basalt/models/profile/GameProfile;", "player", "Lorg/bukkit/entity/Player;", "spigot"})
public final class BukkitProfileAdaptation {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.util.UUID, java.lang.String> backingCacheIpStore = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.profiles.BukkitProfileAdaptation INSTANCE = null;
    
    private BukkitProfileAdaptation() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, java.lang.String> getBackingCacheIpStore() {
        return null;
    }
    
    public final void loadAllEvents() {
    }
    
    public final void initializeGrant(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.RankGrant rankGrant, @org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
    }
    
    public final boolean playerNeedsAuthenticating(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile profile, @org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return false;
    }
}