package ltd.matrixstudios.website

import io.github.nosequel.data.connection.mongo.URIMongoConnectionPool
import net.minebo.basalt.Basalt
import ltd.matrixstudios.website.properties.MongoDatabaseConfigProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan("ltd.matrixstudios.website")
open class BasaltWebApplication
{
	companion object {
		lateinit var instance: BasaltWebApplication

		@JvmStatic
		fun main(args: Array<String>) {
			runApplication<BasaltWebApplication>(*args)

			instance = BasaltWebApplication()
			instance.onEnable()
		}
	}


	fun onEnable()
	{
		val connectionPool = URIMongoConnectionPool().apply {
			this.databaseName = MongoDatabaseConfigProperties.database
			this.uri = MongoDatabaseConfigProperties.uri
		}

		Basalt.start(
			true,
			connectionPool,
			false,
			"localhost",
			6379,
			null,
			null
		)

		println("Started basalt alongside the spring application")
	}
}