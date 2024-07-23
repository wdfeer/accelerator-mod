package net.wdfeer.accelerator.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class AcceleratorConfig extends MidnightConfig {
    @Entry(max = 500)
    public static int acceleratorBonusPercent = 50;
    @Entry(max = 1000)
    public static int fueledAcceleratorBonusPercent = 100;
}
