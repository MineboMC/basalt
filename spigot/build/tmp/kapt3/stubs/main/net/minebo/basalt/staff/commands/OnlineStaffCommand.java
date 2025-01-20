package net.minebo.basalt.staff.commands;

/**
 * Class created on 5/14/2023
 *
 * @author 98ping, AB987
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Lnet/minebo/basalt/staff/commands/OnlineStaffCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "onlineStaff", "", "player", "Lorg/bukkit/entity/Player;", "spigot"})
public final class OnlineStaffCommand extends co.aikar.commands.BaseCommand {
    
    public OnlineStaffCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "onlinestaff|globalstaff|stafflist")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.staff.list")
    public final void onlineStaff(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
}