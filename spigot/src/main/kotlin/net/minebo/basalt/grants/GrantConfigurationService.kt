package net.minebo.basalt.grants

import com.google.gson.reflect.TypeToken
import net.minebo.basalt.Basalt
import net.minebo.basalt.grants.models.GrantDurationModel
import net.minebo.basalt.grants.models.GrantReasonModel
import net.minebo.basalt.redis.RedisPacketManager
import java.lang.reflect.Type

/**
 * Class created on 8/3/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object GrantConfigurationService
{

    var grantDurationModels: MutableMap<String, GrantDurationModel> = mutableMapOf()
    val grantDurationType: Type = object : TypeToken<MutableList<GrantDurationModel>>()
    {}.type

    fun loadAllDurationModel()
    {
        RedisPacketManager.pool.resource.use {
            if (!it.exists("Basalt:Grants:DurationModels"))
            {
                grantDurationModels = getDefaultGrantDurationModels()
                it.set("Basalt:Grants:DurationModels", Basalt.gson.toJson(grantDurationModels.values))
            } else
            {
                val items = it.get("Basalt:Grants:DurationModels")
                val deserialize = Basalt.gson.fromJson<MutableList<GrantDurationModel>>(items, grantDurationType)

                for (dur in deserialize)
                {
                    grantDurationModels[dur.id] = dur
                }
            }
        }
    }

    fun saveAllDurations()
    {
        RedisPacketManager.pool.resource.use {
            it.set("Basalt:Grants:DurationModels", Basalt.gson.toJson(this.grantDurationModels.values))
        }
    }

    fun saveDurationModel(model: GrantDurationModel)
    {
        grantDurationModels[model.id] = model
        RedisPacketManager.pool.resource.use {
            it.set("Basalt:Grants:DurationModels", Basalt.gson.toJson(this.grantDurationModels.values))
        }
    }

    fun deleteDurationModel(model: GrantDurationModel)
    {
        grantDurationModels.remove(model.id)
        RedisPacketManager.pool.resource.use {
            it.set("Basalt:Grants:DurationModels", Basalt.gson.toJson(this.grantDurationModels.values))
        }
    }

    fun getDefaultGrantDurationModels(): MutableMap<String, GrantDurationModel>
    {
        return mutableMapOf(
            "1h" to GrantDurationModel("1h", "WOOL", 13, 10, "1h", "&21 Hour"),
            "1d" to GrantDurationModel("1d", "WOOL", 5, 11, "1d", "&a1 Day"),
            "1w" to GrantDurationModel("1w", "WOOL", 4, 12, "1w", "&e1 Week"),
            "1m" to GrantDurationModel("1m", "WOOL", 1, 13, "30d", "&61 Month"),
            "1y" to GrantDurationModel("1y", "WOOL", 14, 14, "1y", "&c1 Year"),
            "permanent" to GrantDurationModel("permanent", "WOOL", 14, 15, "Permanent", "&4Permanent"),
            "custom" to GrantDurationModel("custom", "WOOL", 8, 16, "custom", "&7Custom")
        )
    }

    var grantReasonModels: MutableMap<String, GrantReasonModel> = mutableMapOf()
    val grantReasonType: Type = object : TypeToken<MutableList<GrantReasonModel>>()
    {}.type

    fun loadAllReasonModel()
    {
        RedisPacketManager.pool.resource.use {
            if (!it.exists("Basalt:Grants:ReasonModels"))
            {
                grantReasonModels = getDefaultGrantReasonModels()
                it.set("Basalt:Grants:ReasonModels", Basalt.gson.toJson(grantReasonModels.values))
            } else
            {
                val items = it.get("Basalt:Grants:ReasonModels")
                val deserialize = Basalt.gson.fromJson<MutableList<GrantReasonModel>>(items, grantReasonType)

                for (dur in deserialize)
                {
                    grantReasonModels[dur.id] = dur
                }
            }
        }
    }

    fun saveAllReasons()
    {
        RedisPacketManager.pool.resource.use {
            it.set("Basalt:Grants:ReasonModels", Basalt.gson.toJson(this.grantReasonModels.values))
        }
    }

    fun saveReasonModel(model: GrantReasonModel)
    {
        grantReasonModels[model.id] = model
        RedisPacketManager.pool.resource.use {
            it.set("Basalt:Grants:ReasonModels", Basalt.gson.toJson(this.grantReasonModels.values))
        }
    }

    fun deleteReasonModel(model: GrantReasonModel)
    {
        grantReasonModels.remove(model.id)
        RedisPacketManager.pool.resource.use {
            it.set("Basalt:Grants:ReasonModels", Basalt.gson.toJson(this.grantReasonModels.values))
        }
    }

    fun getDefaultGrantReasonModels(): MutableMap<String, GrantReasonModel>
    {
        return mutableMapOf(
            "promotion" to GrantReasonModel("promotion", "WOOL", 10, 11, "Promotion", "&5Promotion"),
            "won-event" to GrantReasonModel("won-event", "WOOL", 2, 12, "Won Event", "&dWon Event"),
            "purchased" to GrantReasonModel("purchased", "WOOL", 11, 13, "Purchased", "&9Purchased"),
            "staff-grant" to GrantReasonModel("staff-grant", "WOOL", 9, 14, "Staff Grant", "&3Staff Grant"),
            "custom" to GrantReasonModel("custom", "WOOL", 8, 15, "Custom", "&7Custom"),
        )
    }
}