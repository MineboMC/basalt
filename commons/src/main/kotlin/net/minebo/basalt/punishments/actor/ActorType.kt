package net.minebo.basalt.punishments.actor

enum class ActorType {

    GAME, WEBSITE, EXTERNAL;

    fun proper(type: ActorType) : String {
        val name = type.name
        return name.lowercase().replaceFirstChar { name[0].uppercase() }
    }
}