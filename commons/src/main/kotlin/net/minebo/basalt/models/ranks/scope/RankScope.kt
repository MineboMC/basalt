package net.minebo.basalt.models.ranks.scope

import net.minebo.basalt.models.server.UniqueServer

/**
 * Class created on 7/31/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
data class RankScope(
    var servers: MutableList<String>,
    var global: Boolean
) {

    fun appliesOn(server: UniqueServer) : Boolean = servers.contains(server.id)
}