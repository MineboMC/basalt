package net.minebo.basalt.broadcasts.menu

import net.minebo.basalt.broadcasts.menu.condition.ConditionEditorMenu
import net.minebo.basalt.broadcasts.menu.lines.EditBroadcastLinesMenu
import net.minebo.basalt.broadcasts.model.BroadcastMessage
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.Menu
import net.minebo.basalt.util.menu.buttons.SimpleActionButton
import org.bukkit.Material
import org.bukkit.entity.Player

/**
 * Class created on 1/16/2024

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class BroadcastEditSpecificsMenu(val player: Player, private val broadcast: BroadcastMessage) : Menu(player) {
    init {
        placeholder = true
        staticSize = 27
    }

    override fun getButtons(player: Player): MutableMap<Int, Button> {
        return mutableMapOf(
            10 to SimpleActionButton(
                Material.PAPER,
                broadcast.lines.map { Chat.format(it) }.toMutableList().apply {
                    this.addAll(
                        listOf(
                            "",
                            Chat.format("&aClick to edit lines!")
                        )
                    )
                },
                Chat.format("&e&lEdit Lines"),
                0
            ).setBody { _, _, _ ->
                EditBroadcastLinesMenu(player, broadcast).updateMenu()
            },

            11 to SimpleActionButton(
                Material.REDSTONE_BLOCK,
                broadcast.conditions.map {
                    Chat.format("${it.logicGate.chatColor}&l｜ &f${it.logicGate.displayName}&7: ${it.condition}")
                }.toMutableList().apply {
                    this.addAll(
                        listOf(
                            "",
                            Chat.format("&aClick to edit conditions")
                        )
                    )
                },
                Chat.format("&e&lEdit Conditions"),
                0
            ).setBody { _, _, _ ->
                ConditionEditorMenu(player, broadcast).updateMenu()
            }
        )
    }

    override fun getTitle(player: Player): String {
        return "Editing Broadcast..."
    }
}