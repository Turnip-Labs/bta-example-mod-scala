package turniplabs.examplemod

import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader
import org.slf4j.{Logger, LoggerFactory}
import turniplabs.halplibe.util.{GameStartEntrypoint, RecipeEntrypoint}

object ExampleMod extends ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
	final val MODID: String = "examplemod"
	final val LOGGER: Logger = LoggerFactory.getLogger(MODID)
	override def onInitialize(): Unit = {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with moderate caution.

		LOGGER.info("Initialized.")
	}
	override def beforeGameStart(): Unit = {
		// This code runs as soon as Minecraft starts loading.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("beforeGameStart.")
	}

	override def afterGameStart(): Unit = {
		// This code runs after Minecraft has loaded.
		// All Vanilla resources and most mod resources should have been initialized
		LOGGER.info("afterGameStart.")

	}
	override def onRecipesReady(): Unit = {
		// This code runs after Minecraft has loaded the vanilla recipes.
		LOGGER.info("onRecipesReady.")
	}
}
