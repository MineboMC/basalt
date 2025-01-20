package net.minebo.basalt.commands.alts;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007JG\u0010\b\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \f*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n \f*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \f*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n\u0018\u00010\t0\t\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b\u00a8\u0006\u0011"}, d2 = {"Lnet/minebo/basalt/commands/alts/IpReportCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "ipreport", "", "sender", "Lorg/bukkit/command/CommandSender;", "loadIpReport", "Ljava/util/concurrent/CompletableFuture;", "", "Lnet/minebo/basalt/models/profile/GameProfile;", "kotlin.jvm.PlatformType", "()Ljava/util/concurrent/CompletableFuture;", "createHover", "Lnet/kyori/adventure/text/Component;", "target", "spigot"})
public final class IpReportCommand extends co.aikar.commands.BaseCommand {
    
    public IpReportCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "ipreport")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.ipreport")
    public final void ipreport(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender) {
    }
    
    public final java.util.concurrent.CompletableFuture<java.util.List<net.minebo.basalt.models.profile.GameProfile>> loadIpReport() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.kyori.adventure.text.Component createHover(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target) {
        return null;
    }
}