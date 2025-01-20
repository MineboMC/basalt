package net.minebo.basalt.network

import net.minebo.basalt.api.BasaltAPI
import java.util.*
import java.util.concurrent.TimeUnit

object NetworkManager
{

    fun hasFullyDCed(target: UUID): Boolean
    {
        var offline = false
        val it = BasaltAPI.quickFindProfile(target).get()

        if (!it!!.isOnline() && System.currentTimeMillis().minus(it.lastSeenAt) >= TimeUnit.MINUTES.toMillis(1L))
        {
            offline = true
        } else if (it.isOnline())
        {
            offline = false
        }

        return offline
    }
}