package net.minebo.basalt.punishment.commands.menu;

/**
 * Class created on 5/7/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/punishment/commands/menu/ExecutedPunishmentHistoryCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "checkOthers", "", "player", "Lorg/bukkit/entity/Player;", "profile", "Lnet/minebo/basalt/models/profile/GameProfile;", "spigot"})
public final class ExecutedPunishmentHistoryCommand extends co.aikar.commands.BaseCommand {
    
    public ExecutedPunishmentHistoryCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "staffhist|staffhistory")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.punishments.check")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    public final void checkOthers(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @co.aikar.commands.annotation.Optional()
    @org.jetbrains.annotations.Nullable()
    net.minebo.basalt.models.profile.GameProfile profile) {
    }
}