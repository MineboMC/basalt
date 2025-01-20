package net.minebo.basalt.models.queue.comparator

import net.minebo.basalt.models.queue.player.QueueEntry

/**
 * Class created on 7/12/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class QueueComparator : Comparator<QueueEntry> {

    override fun compare(firstPlayer: QueueEntry, secondPlayer: QueueEntry): Int {
        return secondPlayer.compareTo(firstPlayer)
    }
}