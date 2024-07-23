package net.wdfeer.accelerator.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.wdfeer.accelerator.block.custom.Accelerator;
import net.wdfeer.accelerator.config.AcceleratorConfig;

public class AcceleratorEntity extends BlockTickerEntity {
    public AcceleratorEntity(BlockPos pos, BlockState state) {
        super(Accelerator.blockEntityType, pos, state);
    }
    @Override
    public float getExtraTicks(){
        return AcceleratorConfig.acceleratorBonusPercent / 100f;
    }
    @Override
    public int getRadius() {
        return 1;
    }
}
