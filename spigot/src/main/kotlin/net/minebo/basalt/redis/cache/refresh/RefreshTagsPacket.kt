package net.minebo.basalt.redis.cache.refresh

import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.tags.TagService

class RefreshTagsPacket : RedisPacket("refresh-tags")
{

    override fun action()
    {
        val cache = TagService.cache

        cache.clear()

        TagService.getValues().thenAccept {
            for (tag in it)
            {
                cache[tag.id] = tag
            }
        }
    }
}