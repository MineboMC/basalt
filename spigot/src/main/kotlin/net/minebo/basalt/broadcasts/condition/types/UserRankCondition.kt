package net.minebo.basalt.broadcasts.condition.types

import net.minebo.basalt.broadcasts.condition.ConditionType
import net.minebo.basalt.profiles.getCurrentRank
import org.bukkit.entity.Player

/**
 * Class created on 1/16/2024

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class UserRankCondition : ConditionType()
{
    override fun testFor(player: Player, value: String): Boolean
    {
        val rankWeight = value.toIntOrNull()
            ?: return false

        val playerRank = player.getCurrentRank()

        return playerRank.weight <= rankWeight
    }
}