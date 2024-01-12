package net.wdfeer.accelerator;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.wdfeer.accelerator.block.ModBlocks;
import net.wdfeer.accelerator.ui.Screens;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientInitializer implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Screens.InitializeClient();
	}
}
