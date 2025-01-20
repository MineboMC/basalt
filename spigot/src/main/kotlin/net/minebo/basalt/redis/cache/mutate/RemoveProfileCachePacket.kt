package net.minebo.basalt.redis.cache.mutate

import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.profiles.ProfileGameService

class RemoveProfileCachePacket(val gameprofile: GameProfile) : RedisPacket("remove-from-cache")
{

    override fun action()
    {
        val cache = ProfileGameService.cache

        if (cache.containsKey(gameprofile.uuid))
        {
            cache.remove(gameprofile.uuid)
        }
    }
}