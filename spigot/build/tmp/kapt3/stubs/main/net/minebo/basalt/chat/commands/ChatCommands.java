package net.minebo.basalt.chat.commands;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\u000b"}, d2 = {"Lnet/minebo/basalt/chat/commands/ChatCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "slowchat", "", "player", "Lorg/bukkit/command/CommandSender;", "duration", "", "mutechat", "spigot"})
public final class ChatCommands extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.chat.commands.ChatCommands INSTANCE = null;
    
    private ChatCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "slowchat")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.chat.admin")
    public final void slowchat(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender player, @co.aikar.commands.annotation.Name(value = "duration")
    int duration) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "mutechat")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.chat.admin")
    public final void mutechat(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender player) {
    }
}