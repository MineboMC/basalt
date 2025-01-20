package net.minebo.basalt.service.vouchers

import com.mongodb.client.MongoCollection
import io.github.nosequel.data.DataStoreType
import net.minebo.basalt.Basalt
import net.minebo.basalt.models.vouchers.VoucherGrant
import net.minebo.basalt.models.vouchers.VoucherTemplate
import net.minebo.basalt.service.GeneralizedService
import org.bson.Document
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

object VoucherService : GeneralizedService {

    val voucherGrants: ConcurrentHashMap<UUID, MutableList<VoucherGrant>> = ConcurrentHashMap()
    val voucherTemplates: ConcurrentHashMap<String, VoucherTemplate> = ConcurrentHashMap()

    val handler = Basalt.dataHandler.createStoreType<UUID, VoucherGrant>(Basalt.getDataStoreMethod())
    val handlerTemplates = Basalt.dataHandler.createStoreType<String, VoucherTemplate>(Basalt.getDataStoreMethod())

    val collection: MongoCollection<Document> = Basalt.MongoConnectionPool.getCollection("vouchergrant")

    fun loadVoucherGrants() {
        val items = handler.retrieveAllAsync().thenAccept { voucherCollection ->
            for (voucher in voucherCollection) {
                val list = (voucherGrants.getOrDefault(voucher.givenTo, mutableListOf())).also { it.add(voucher) }

                voucherGrants[voucher.givenTo] = list
            }
        }
    }

    fun loadVoucherTemplates() {
        handlerTemplates.retrieveAllAsync().thenAccept { templates ->
            for (voucher in templates) {
                voucherTemplates[voucher.id] = voucher
            }
        }
    }

    fun findVoucherTemplate(id: String) : VoucherTemplate? {
        if (voucherTemplates.containsKey(id)) {
            return voucherTemplates[id]!!
        }

        return handlerTemplates.retrieve(id)
    }

    fun insertTemplate(voucherTemplate: VoucherTemplate) {
        handlerTemplates.storeAsync(voucherTemplate.id, voucherTemplate)
        voucherTemplates[voucherTemplate.id] = voucherTemplate
    }

    fun insertGrant(target: UUID, newVoucher: VoucherGrant) {
        val list = (voucherGrants.getOrDefault(target, mutableListOf())).also { it.add(newVoucher) }

        voucherGrants[target] = list
        handler.storeAsync(newVoucher.uniqueId, newVoucher)
    }

    fun allGrantsFromPlayer(player: UUID): MutableList<VoucherGrant> {
        if (voucherGrants.containsKey(player)) {
            return voucherGrants[player]!!
        }

        val ret = mutableListOf<VoucherGrant>()
        val query = Document("_id", player)
        val items = collection.find(query)

        for (document in items) {
            val gson = Basalt.gson.fromJson(document.toJson(), VoucherGrant::class.java)
            ret.add(gson)
        }

        return ret
    }
 }