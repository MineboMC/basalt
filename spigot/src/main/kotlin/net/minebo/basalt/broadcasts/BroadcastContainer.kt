package net.minebo.basalt.broadcasts

import net.minebo.basalt.broadcasts.model.BroadcastMessage

data class BroadcastContainer(
    val broadcasts: MutableMap<String, BroadcastMessage> = mutableMapOf()
)
{
    fun getBroadcastMessage(id: String) = broadcasts[id]
}
