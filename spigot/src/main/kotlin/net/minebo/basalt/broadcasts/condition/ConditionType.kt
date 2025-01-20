package net.minebo.basalt.broadcasts.condition

import org.bukkit.entity.Player

/**
 * Class created on 1/16/2024

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
abstract class ConditionType {

    abstract fun testFor(player: Player, value: String): Boolean
}