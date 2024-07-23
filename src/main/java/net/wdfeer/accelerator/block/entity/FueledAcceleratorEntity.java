package net.wdfeer.accelerator.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.wdfeer.accelerator.block.custom.FueledAccelerator;
import net.wdfeer.accelerator.config.AcceleratorConfig;

public class FueledAcceleratorEntity extends FueledBlockTickerEntity {
    public FueledAcceleratorEntity(BlockPos pos, BlockState state) {
        super(FueledAccelerator.blockEntityType, pos, state);
    }
    @Override
    public float getExtraTicks(){
        return AcceleratorConfig.fueledAcceleratorBonusPercent / 100f;
    }
    @Override
    public int getRadius() {
        return 1;
    }
    @Override
    public float getFuelConsumption() {
        return 2f;
    }
}
