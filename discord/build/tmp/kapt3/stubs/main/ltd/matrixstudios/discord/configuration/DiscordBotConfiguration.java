package ltd.matrixstudios.discord.configuration;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0003H'\u00a8\u0006\u0005"}, d2 = {"Lltd/matrixstudios/discord/configuration/DiscordBotConfiguration;", "", "getSyncChannelId", "", "getMongoURI", "discord"})
public abstract interface DiscordBotConfiguration {
    
    @ltd.matrixstudios.amber.configurations.annotate.Intrinsic()
    @ltd.matrixstudios.amber.configurations.annotate.EntryName(name = "getSyncChannelId")
    @ltd.matrixstudios.amber.configurations.annotate.primitives.DefaultString(content = "CHANNEL-ID")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSyncChannelId();
    
    @ltd.matrixstudios.amber.configurations.annotate.Intrinsic()
    @ltd.matrixstudios.amber.configurations.annotate.EntryName(name = "mongo-uri")
    @ltd.matrixstudios.amber.configurations.annotate.primitives.DefaultString(content = "mongodb://localhost:27017")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getMongoURI();
}