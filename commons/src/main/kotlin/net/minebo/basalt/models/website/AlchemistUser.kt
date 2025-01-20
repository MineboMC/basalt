package net.minebo.basalt.models.website

import java.util.UUID

/**
 * Class created on 11/24/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
data class BasaltUser(
    var random_id: UUID = UUID.randomUUID(),
    var minecraft_uuid: UUID = UUID.randomUUID(),
    var username: String = "Guest",
    var password: String? = null,
    var secret: String? = null,
    var administrator: Boolean = false,
    var authenticated: Boolean = false,
    var permissions: MutableList<String> = mutableListOf()
) {
    fun hasPermission(permission: String) : Boolean {
        return permissions.contains(permission);
    }

    fun getNiceUUID() : String {
        return minecraft_uuid.toString().replace("-", "")
    }
}