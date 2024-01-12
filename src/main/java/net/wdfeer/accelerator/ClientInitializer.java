package net.wdfeer.accelerator;

import net.fabricmc.api.ClientModInitializer;
import net.wdfeer.accelerator.ui.Screens;

public class ClientInitializer implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Screens.InitializeClient();
	}
}
