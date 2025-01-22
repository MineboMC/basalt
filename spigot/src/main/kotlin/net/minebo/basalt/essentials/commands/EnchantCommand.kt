package net.minebo.essentials.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.*
import org.bukkit.ChatColor
import org.bukkit.enchantments.Enchantment
import org.bukkit.enchantments.EnchantmentWrapper
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

@CommandAlias("enchant")
@CommandPermission("basic.enchant")
@Description("Enchant an item")
class EnchantCommand : BaseCommand() {

    @Default
    @CommandCompletion("@enchantments")
    fun onEnchant(
        sender: Player,
        @Conditions("validEnchantment") enchantmentName: String,
        @Default("1") level: Int
    ) {
        if (level <= 0) {
            sender.sendMessage("${ChatColor.RED}The level must be greater than 0.")
            return
        }

        val enchantment = EnchantmentWrapper.getByName(enchantmentName)
        if (enchantment == null) {
            sender.sendMessage("${ChatColor.RED}Invalid enchantment: $enchantmentName")
            return
        }

        enchantItemInHand(sender, enchantment, level)
    }

    private fun enchantItemInHand(sender: Player, enchantment: Enchantment, level: Int) {
        val item: ItemStack? = sender.inventory.itemInHand
        if (item == null) {
            sender.sendMessage("${ChatColor.RED}You must be holding an item.")
            return
        }

        val wrapper = getEnchantmentByName(enchantment.name)

        if (!handleLevel(sender, wrapper, level)) return

        item.addUnsafeEnchantment(enchantment, level)
        sender.updateInventory()
        if (wrapper != null) {
            sender.sendMessage(
                "${ChatColor.GOLD}Enchanted your ${ChatColor.WHITE}${item.type}" +
                        "${ChatColor.GOLD} with ${ChatColor.WHITE}${wrapper.name}" +
                        "${ChatColor.GOLD} level ${ChatColor.WHITE}$level${ChatColor.GOLD}."
            )
        }
    }

    private fun handleLevel(sender: Player, wrapper: Enchantment?, level: Int): Boolean {
        if (wrapper != null) {
            if (level > wrapper.maxLevel && !sender.hasPermission("basic.enchant.force")) {
                sender.sendMessage(
                    "${ChatColor.RED}The maximum enchanting level for ${wrapper.name} is " +
                            "${wrapper.maxLevel}. You provided $level."
                )
                return false
            }
        }

        if (wrapper != null) {
            if (level > wrapper.maxLevel) {
                sender.sendMessage(
                    "${ChatColor.RED}${ChatColor.BOLD}WARNING: ${ChatColor.YELLOW}You added ${wrapper.name} $level " +
                            "to this item. The default maximum value is ${wrapper.maxLevel}."
                )
            }
        }

        return true
    }

    private fun getEnchantmentByName(name: String): Enchantment? {
        return Enchantment.values().firstOrNull { it.name.equals(name, ignoreCase = true) }
    }
}
