package net.minebo.basalt.grants.models

/**
 * Class created on 8/3/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
data class GrantDurationModel(
    var id: String,
    var item: String,
    var data: Int,
    var menuSlot: Int,
    var duration: String,
    var displayName: String
)