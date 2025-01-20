package net.minebo.basalt.module;

/**
 * Class created on 7/21/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lnet/minebo/basalt/module/PluginModule;", "", "onLoad", "", "getCommands", "", "Lco/aikar/commands/BaseCommand;", "getModularConfigOption", "", "spigot"})
public abstract interface PluginModule {
    
    public abstract void onLoad();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<co.aikar.commands.BaseCommand> getCommands();
    
    public abstract boolean getModularConfigOption();
}