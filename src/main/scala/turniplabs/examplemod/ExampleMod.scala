package turniplabs.examplemod

import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader
import org.slf4j.{Logger, LoggerFactory}

object ExampleMod extends ModInitializer {
	final val MODID: String = "examplemod"
	final val LOGGER: Logger = LoggerFactory.getLogger(MODID)

	override def onInitialize(): Unit = {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Initialized.")
	}
}
