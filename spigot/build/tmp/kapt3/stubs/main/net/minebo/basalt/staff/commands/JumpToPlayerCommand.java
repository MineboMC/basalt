package net.minebo.basalt.staff.commands;

/**
 * Class created on 5/14/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/staff/commands/JumpToPlayerCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "jumpTo", "", "player", "Lorg/bukkit/entity/Player;", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "spigot"})
public final class JumpToPlayerCommand extends co.aikar.commands.BaseCommand {
    
    public JumpToPlayerCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "jumptoplayer|jtp|jumpto")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.jtp")
    public final void jumpTo(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target) {
    }
}