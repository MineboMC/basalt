package net.minebo.basalt.models.sessions

import net.minebo.basalt.models.server.UniqueServer
import java.util.*

data class Session(
    var randomId: String,
    var player: UUID,

    var serversJoined: MutableMap<Long, UniqueServer>,
    var loggedInAt: Long,
    var leftAt: Long,
)
