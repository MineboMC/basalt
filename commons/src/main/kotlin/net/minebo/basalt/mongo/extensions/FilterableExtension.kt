package net.minebo.basalt.mongo.extensions

import com.mongodb.client.model.Filters
import net.minebo.basalt.Basalt
import org.bson.Document
import org.bson.conversions.Bson
import kotlin.reflect.KProperty

/**
 * Class created on 9/27/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
infix fun <V> KProperty<V?>.eq(value: V?): Bson = Filters.eq(this.name, value)
infix fun <V> Document.deserialize(clazz: Class<V>) : V? = Basalt.gson.fromJson(this.toJson(), clazz)