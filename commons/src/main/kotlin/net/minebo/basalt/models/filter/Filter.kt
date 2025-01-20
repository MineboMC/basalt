package net.minebo.basalt.models.filter

import net.minebo.basalt.punishments.PunishmentType
import java.util.*

data class Filter(
    var id: UUID,
    var word: String,
    var silent: Boolean,
    var punishmentType: PunishmentType,
    var duration: String,
    var staffExempt: Boolean,
    var exemptPermission: String,
    var shouldPunish: Boolean,
) {

}