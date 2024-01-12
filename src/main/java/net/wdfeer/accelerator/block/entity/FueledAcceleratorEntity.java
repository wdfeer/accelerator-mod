package net.wdfeer.accelerator.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.wdfeer.accelerator.block.custom.FueledAccelerator;

public class FueledAcceleratorEntity extends FueledBlockTickerEntity {
    public FueledAcceleratorEntity(BlockEntityType type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
    public FueledAcceleratorEntity(BlockPos pos, BlockState state) {
        super(FueledAccelerator.blockEntityType, pos, state);
    }
    @Override
    public float getExtraTicks(){
        return 1f;
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
