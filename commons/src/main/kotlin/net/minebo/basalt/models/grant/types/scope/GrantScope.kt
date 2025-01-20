package net.minebo.basalt.models.grant.types.scope

import net.minebo.basalt.models.server.UniqueServer

/**
 * Class created on 6/20/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
data class GrantScope(
    var scopeReason: String,
    var servers: MutableList<String>,
    var global: Boolean
) {

    fun appliesOn(server: UniqueServer) : Boolean = servers.contains(server.id)

}