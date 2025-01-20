package net.minebo.basalt.commands.notes;

@co.aikar.commands.annotation.CommandAlias(value = "notes|note")
@co.aikar.commands.annotation.CommandPermission(value = "basalt.profiles.admin")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J$\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lnet/minebo/basalt/commands/notes/PlayerNotesCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "default", "", "sender", "Lorg/bukkit/entity/Player;", "gameProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "add", "note", "", "spigot"})
public final class PlayerNotesCommands extends co.aikar.commands.BaseCommand {
    
    public PlayerNotesCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "add")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    public final void add(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player sender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile, @co.aikar.commands.annotation.Name(value = "note")
    @org.jetbrains.annotations.NotNull()
    java.lang.String note) {
    }
}