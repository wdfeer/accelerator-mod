package net.wdfeer.accelerator.ui;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.wdfeer.accelerator.AcceleratorMod;

public class Screens {
    public static ScreenHandlerType<FueledBlockTickerScreenHandler> FUELED_BLOCK_TICKER_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(AcceleratorMod.MOD_ID, "fueled_block_ticker"),
                    FueledBlockTickerScreenHandler::new);
    public static void Initialize(){}
    public static void InitializeClient() {
        HandledScreens.register(FUELED_BLOCK_TICKER_SCREEN_HANDLER, FueledBlockTickerScreen::new);
    }
}
