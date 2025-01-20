package net.minebo.basalt.broadcasts.condition

import net.minebo.basalt.broadcasts.condition.types.UserRankCondition

/**
 * Class created on 1/16/2024

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object ConditionTypeService
{
    val allTypes = mutableMapOf(
        "rank" to UserRankCondition()
    )
}