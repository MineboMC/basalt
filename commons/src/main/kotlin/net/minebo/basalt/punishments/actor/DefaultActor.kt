package net.minebo.basalt.punishments.actor

import net.minebo.basalt.punishments.actor.executor.Executor

data class DefaultActor(
    var executor: Executor,
    var actorType: ActorType
)