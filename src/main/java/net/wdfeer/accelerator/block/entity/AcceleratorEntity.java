package net.wdfeer.accelerator.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.wdfeer.accelerator.block.custom.Accelerator;

import java.util.Arrays;

public class AcceleratorEntity extends BlockTickerEntity {
    public AcceleratorEntity(BlockEntityType type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
    public AcceleratorEntity(BlockPos pos, BlockState state) {
        super(Accelerator.blockEntityType, pos, state);
    }
    @Override
    public float getExtraTicks(){
        return 1;
    }
    @Override
    public int getRadius() {
        return 1;
    }
}
