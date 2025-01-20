package ltd.matrixstudios.discord.sync

import com.mongodb.client.model.Filters
import net.minebo.basalt.Basalt
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.service.profiles.ProfileGameService
import java.util.concurrent.CompletableFuture

/**
 * Class created on 2/14/2024

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object SyncService
{
    private val collection = ProfileGameService.collection
    fun getSyncCodeForUser(username: String): CompletableFuture<String?>
    {
        return CompletableFuture.supplyAsync {
            val user = collection.find(Filters.eq("lowercasedUsername", username.lowercase())).firstOrNull()
                ?: return@supplyAsync null

            return@supplyAsync Basalt.gson.fromJson(user.toJson(), GameProfile::class.java).syncCode
        }
    }
}