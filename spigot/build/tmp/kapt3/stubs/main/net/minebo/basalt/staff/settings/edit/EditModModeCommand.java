package net.minebo.basalt.staff.settings.edit;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lnet/minebo/basalt/staff/settings/edit/EditModModeCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "editmodMode", "", "player", "Lorg/bukkit/entity/Player;", "savemodmode", "wipeModMode", "target", "Lco/aikar/commands/bukkit/contexts/OnlinePlayer;", "spigot"})
public final class EditModModeCommand extends co.aikar.commands.BaseCommand {
    
    public EditModModeCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "editmodmode")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.staffmode")
    public final void editmodMode(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "savemodmode")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.staffmode")
    public final void savemodmode(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "wipemodmode")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.staffmode.admin")
    @co.aikar.commands.annotation.CommandCompletion(value = "@players")
    public final void wipeModMode(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    co.aikar.commands.bukkit.contexts.OnlinePlayer target) {
    }
}