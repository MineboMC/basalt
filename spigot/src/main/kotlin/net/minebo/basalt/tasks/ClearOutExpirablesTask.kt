package net.minebo.basalt.tasks

import com.mongodb.client.model.Aggregates
import com.mongodb.client.model.Filters
import net.minebo.basalt.Basalt
import net.minebo.basalt.models.grant.types.Punishment
import net.minebo.basalt.models.grant.types.RankGrant
import net.minebo.basalt.profiles.permissions.packet.PermissionUpdatePacket
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.service.expirable.PunishmentService
import net.minebo.basalt.service.expirable.RankGrantService
import org.bson.Document
import org.bukkit.scheduler.BukkitRunnable
import java.util.*

object ClearOutExpirablesTask : BukkitRunnable()
{

    private val rankGrantCollection = RankGrantService.collection
    private val punishmentCollection = PunishmentService.collection

    override fun run()
    {
        val maxIntLong = Integer.MAX_VALUE.toLong()

        rankGrantCollection
            .aggregate(
                listOf(
                    Aggregates.unwind("\$expirable"),
                    Aggregates.match(Filters.eq("expirable.expired", false))
                )
            ).forEach {
                val unwindedDocument = it.get("expirable", Document::class.java)
                val addedAt = unwindedDocument.getString("addedAt").toLong()
                val duration = unwindedDocument.getString("duration").toLong()

                if (duration != maxIntLong)
                {
                    if (it["removedBy"] == null
                        &&
                        duration != -1L
                        &&
                        (addedAt + duration) - System.currentTimeMillis() <= 0
                    )
                    {
                        val objectifiedGrant = Basalt.gson.fromJson(it.toJson(), RankGrant::class.java)

                        objectifiedGrant.removedBy = UUID.fromString("00000000-0000-0000-0000-000000000000")
                        objectifiedGrant.removedReason = "Expired"

                        RankGrantService.saveSync(objectifiedGrant).whenComplete { t, u ->
                            RankGrantService.recalculateUUID(t.target)
                            AsynchronousRedisSender.send(PermissionUpdatePacket(t.target))
                        }
                    }
                }
            }

        punishmentCollection
            .aggregate(
                listOf(
                    Aggregates.unwind("\$expirable"),
                    Aggregates.match(Filters.eq("expirable.expired", false))
                )
            ).forEach {
                val unwindedDocument = it.get("expirable", Document::class.java)
                val addedAt = unwindedDocument.getString("addedAt").toLong()
                val duration = unwindedDocument.getString("duration").toLong()

                if (duration != maxIntLong)
                {
                    if (it["removedBy"] == null
                        &&
                        duration != -1L
                        &&
                        (addedAt + duration) - System.currentTimeMillis() <= 0
                    )
                    {
                        val objectifiedGrant = Basalt.gson.fromJson(it.toJson(), Punishment::class.java)

                        objectifiedGrant.removedBy = UUID.fromString("00000000-0000-0000-0000-000000000000")
                        objectifiedGrant.removedReason = "Expired"

                        PunishmentService.saveSync(objectifiedGrant)
                    }
                }
            }
    }
}

