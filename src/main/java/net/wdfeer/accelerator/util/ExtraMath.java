package net.wdfeer.accelerator.util;

import java.util.Random;

public class ExtraMath {
    public static int RandomRound(float f){
        return (int)Math.floor(f) + (new Random().nextFloat() < (f % 1) ? 1 : 0);
    }
}
