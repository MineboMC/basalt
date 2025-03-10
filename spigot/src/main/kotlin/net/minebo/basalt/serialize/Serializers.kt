package net.minebo.basalt.serialize

import com.google.gson.*

object Serializers
{
    val GSON: Gson = GsonBuilder()
        .serializeNulls()
        .setPrettyPrinting()
        .setLongSerializationPolicy(LongSerializationPolicy.STRING)
        .setExclusionStrategies(object : ExclusionStrategy
        {
            override fun shouldSkipField(p0: FieldAttributes): Boolean
            {
                return false
            }

            override fun shouldSkipClass(p0: Class<*>): Boolean
            {
                if (p0.simpleName.equals("EntityItemFrame", ignoreCase = true))
                {
                    return true
                }

                return false
            }

        })
        .create()
}