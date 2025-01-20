package net.minebo.basalt.service.website

import io.github.nosequel.data.DataStoreType
import net.minebo.basalt.Basalt
import net.minebo.basalt.models.website.BasaltUser
import net.minebo.basalt.service.GeneralizedService
import org.bson.Document
import java.util.*
object WebProfileService : GeneralizedService
{
    var handler = Basalt.dataHandler.createStoreType<UUID, BasaltUser>(Basalt.getDataStoreMethod())
    val collection = Basalt.MongoConnectionPool.getCollection("basaltuser")

    fun byId(uuid: UUID): BasaltUser? {
        val document = collection.find(Document("minecraft_uuid", uuid.toString())).first()
            ?: return null

        return Basalt.gson.fromJson(document.toJson(), BasaltUser::class.java)
    }

    fun save(user: BasaltUser) {
        handler.storeAsync(user.random_id, user)
    }
}
