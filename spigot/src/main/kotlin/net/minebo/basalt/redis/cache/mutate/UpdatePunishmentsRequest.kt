package net.minebo.basalt.redis.cache.mutate

import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.expirable.PunishmentService
import java.util.*

class UpdatePunishmentsRequest(val target: UUID) : RedisPacket("punishment-sync-update")
{

    override fun action()
    {
        PunishmentService.recalculateUUID(target)
    }
}