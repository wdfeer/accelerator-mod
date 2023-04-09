package net.wdfeer.accelerator.block;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wdfeer.accelerator.AcceleratorMod;
import net.wdfeer.accelerator.block.entity.*;

public class ModBlockEntityTypes {
    public static <T extends BlockEntity> BlockEntityType<T> RegisterBlockEntityType(String name, FabricBlockEntityTypeBuilder.Factory<T> factory, net.minecraft.block.Block block){
        return Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(AcceleratorMod.MOD_ID, name),
                FabricBlockEntityTypeBuilder.create(factory, block).build());
    }
    public static void Initialize() {}
}
