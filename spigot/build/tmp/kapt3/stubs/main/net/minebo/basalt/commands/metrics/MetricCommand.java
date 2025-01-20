package net.minebo.basalt.commands.metrics;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\f"}, d2 = {"Lnet/minebo/basalt/commands/metrics/MetricCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "metrics", "", "player", "Lorg/bukkit/entity/Player;", "decoy", "amt", "", "performanceTest", "spigot"})
public final class MetricCommand extends co.aikar.commands.BaseCommand {
    
    public MetricCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "metrics|mylaggyserver")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.metrics")
    public final void metrics(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "decoyprofiles")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.owner")
    public final void decoy(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, int amt) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "performancetest")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.metrics")
    public final void performanceTest(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
}