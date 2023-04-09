package net.wdfeer.accelerator;

import net.fabricmc.api.ModInitializer;
import net.wdfeer.accelerator.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AcceleratorMod implements ModInitializer {
	public static final String MOD_ID = "accelerator";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.Initialize();
	}
}
