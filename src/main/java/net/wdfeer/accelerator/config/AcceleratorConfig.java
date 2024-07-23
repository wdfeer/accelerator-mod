package net.wdfeer.accelerator.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class AcceleratorConfig extends MidnightConfig {
    @Entry(max = 10)
    public static float acceleratorBonus = 0.5f;
    @Entry(max = 20)
    public static float fueledAcceleratorBonus = 1f;
}
