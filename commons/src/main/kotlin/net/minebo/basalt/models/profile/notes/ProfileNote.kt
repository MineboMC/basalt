package net.minebo.basalt.models.profile.notes

import java.util.UUID

data class ProfileNote(
    val author: UUID,
    val content: String,
    val createdAt: Long
)