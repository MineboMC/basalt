package net.minebo.basalt.punishment.commands.menu.impl.proof

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.grant.types.Punishment
import net.minebo.basalt.models.grant.types.proof.ProofEntry
import net.minebo.basalt.punishment.commands.menu.impl.GeneralPunishmentMenu
import net.minebo.basalt.punishment.commands.menu.impl.filter.PunishmentFilter
import net.minebo.basalt.punishment.commands.menu.impl.proof.inspection.ProofInspectionMenu
import net.minebo.basalt.punishment.commands.menu.impl.proof.sub.ProofSelectTypeMenu
import net.minebo.basalt.service.expirable.PunishmentService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.buttons.SimpleActionButton
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import java.util.*

class ProofMenu(val player: Player, val punishment: Punishment) : PaginatedMenu(18, player)
{

    override fun getHeaderItems(player: Player): MutableMap<Int, Button>
    {
        val buttons = hashMapOf<Int, Button>()
        buttons[3] = SimpleActionButton(
            Material.NETHER_STAR,
            mutableListOf(),
            "&aClick to add Proof",
            0
        ).setBody { player, i, clickType ->
            ProofSelectTypeMenu(player, punishment).openMenu()
        }

        buttons[5] =
            SimpleActionButton(Material.FEATHER, mutableListOf(), "&cGo Back", 0).setBody { player, i, clickType ->
                val prof = punishment.getTargetProfile()

                if (prof == null)
                {
                    player.closeInventory()
                    player.sendMessage(Chat.format("&cCould not open this menu. Profile doesn't exist."))
                    return@setBody
                }

                GeneralPunishmentMenu(
                    prof,
                    punishment.getGrantable(),
                    PunishmentService.getFromCache(punishment.target).toMutableList(),
                    PunishmentFilter.ALL, player
                ).updateMenu()
            }

        return buttons
    }

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()

        var index = 0
        for (proof in punishment.proof)
        {
            buttons[index++] = ProofButton(proof, punishment)
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Proof of: ${punishment.easyFindId}"
    }

    class ProofButton(val proofEntry: ProofEntry, val punishment: Punishment) : Button()
    {
        override fun getMaterial(player: Player): Material
        {
            return Material.PAPER
        }

        override fun getDescription(player: Player): MutableList<String>
        {
            val desc = mutableListOf<String>()
            if (!proofEntry.shouldBeConfidential)
            {
                desc.add(Chat.format("&6&m---------------------------------"))
                desc.add(Chat.format("&eType: " + proofEntry.type.displayName))
                desc.add(Chat.format("&eAdded At: &f" + Date(proofEntry.addedAt)))
                desc.add(Chat.format("&eAdded By: &f" + BasaltAPI.getRankDisplay(proofEntry.whoAdded)))
                if (proofEntry.reviewStatus != null)
                {
                    desc.add(" ")
                    desc.add(Chat.format("&eReviewed By: &f${BasaltAPI.getRankDisplay(proofEntry.reviewer!!)}"))
                    desc.add(Chat.format("&eReviewed At: &f${Date(proofEntry.reviewedAt!!)}"))
                    desc.add(Chat.format("&eOutcome: &f${proofEntry.reviewStatus!!.displayName}"))
                }
                desc.add(" ")

                desc.add(Chat.format("&aLeft-Click to view the proof"))
                if (player.hasPermission("basalt.punishments.proof.reviewer"))
                {
                    desc.add(Chat.format("&eRight-Click to review proof"))
                }
                desc.add(Chat.format("&6&m---------------------------------"))
            } else
            {
                desc.add(Chat.format("&6&m---------------------------------"))
                desc.add(Chat.format("&eType: &f" + proofEntry.type.displayName))
                desc.add(Chat.format("&eAdded At: &f" + Date(proofEntry.addedAt)))
                desc.add(Chat.format("&eAdded By: &f" + BasaltAPI.getRankDisplay(proofEntry.whoAdded)))
                if (proofEntry.reviewStatus != null)
                {
                    desc.add(" ")
                    desc.add(Chat.format("&eReviewed By: &f${BasaltAPI.getRankDisplay(proofEntry.reviewer!!)}"))
                    desc.add(Chat.format("&eReviewed At: &f${Date(proofEntry.reviewedAt!!)}"))
                    desc.add(Chat.format("&eOutcome: &f${proofEntry.reviewStatus!!.displayName}"))
                }
                desc.add(" ")
                if (player.hasPermission("basalt.punishments.proof.elevation"))
                {
                    desc.add(Chat.format("&aLeft-Click to view the proof"))

                    if (player.hasPermission("basalt.punishments.proof.reviewer"))
                    {
                        desc.add(Chat.format("&eRight-Click to review proof"))
                    }
                } else
                {
                    desc.add(Chat.format("&c&lConfidential Proof"))
                }
                desc.add(Chat.format("&6&m---------------------------------"))
            }

            return desc
        }

        override fun getDisplayName(player: Player): String
        {
            return Chat.format(BasaltAPI.getRankDisplay(proofEntry.whoAdded))
        }

        override fun getData(player: Player): Short
        {
            return 0
        }

        override fun onClick(player: Player, slot: Int, type: ClickType)
        {
            if (type.isLeftClick)
            {
                if (!proofEntry.shouldBeConfidential)
                {
                    player.sendMessage(proofEntry.link)
                } else
                {
                    if (player.hasPermission("basalt.punishments.proof"))
                    {
                        player.sendMessage(proofEntry.link)
                    }
                }
            } else
            {
                if (player.hasPermission("basalt.punishments.proof.reviewer"))
                {
                    ProofInspectionMenu(player, punishment, proofEntry).openMenu()
                }
            }
        }
    }
}