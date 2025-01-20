package net.minebo.basalt.punishment.commands.menu.impl.proof.inspection

import net.minebo.basalt.Basalt
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.grant.types.Punishment
import net.minebo.basalt.models.grant.types.proof.ProofEntry
import net.minebo.basalt.punishment.commands.menu.impl.proof.ProofMenu
import net.minebo.basalt.punishment.commands.menu.impl.proof.sub.ProofSelectTypeMenu
import net.minebo.basalt.service.expirable.PunishmentService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.Menu
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class ProofInspectionMenu(val player: Player, val punishment: Punishment, val proofEntry: ProofEntry) : Menu(player)
{

    init
    {
        staticSize = 27
        placeholder = true
    }

    override fun getButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()

        buttons[12] = ProofInspectionButton(ProofEntry.ReviewStatus.ACCEPTED, punishment, proofEntry)
        buttons[13] = ProofInspectionButton(ProofEntry.ReviewStatus.REPUNISHED, punishment, proofEntry)
        buttons[14] = ProofInspectionButton(ProofEntry.ReviewStatus.REJECTED, punishment, proofEntry)

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Inspecting Proof..."
    }


    class ProofInspectionButton(private val outcome: ProofEntry.ReviewStatus, val punishment: Punishment, val proofEntry: ProofEntry) : Button()
    {
        override fun getMaterial(player: Player): Material
        {
            return Material.WOOL
        }

        override fun getDescription(player: Player): MutableList<String>?
        {
            return mutableListOf(
                Chat.format("&aLeft-Click to set the status to ${outcome.displayName}")
            )
        }

        override fun getDisplayName(player: Player): String?
        {
            return Chat.format(outcome.displayName)
        }

        override fun getData(player: Player): Short
        {
            return BasaltAPI.getWoolColor(outcome.displayName).woolData.toShort()
        }

        override fun onClick(player: Player, slot: Int, type: ClickType)
        {
            punishment.proof.remove(proofEntry)

            proofEntry.reviewStatus = outcome
            proofEntry.reviewedAt = System.currentTimeMillis()
            proofEntry.reviewer = player.uniqueId


            punishment.proof.add(proofEntry)
            PunishmentService.save(punishment)

            player.sendMessage(Chat.format("&aYou have just edited the proof review status of #${punishment.easyFindId}"))
            ProofMenu(player, punishment).updateMenu()
        }

    }
}