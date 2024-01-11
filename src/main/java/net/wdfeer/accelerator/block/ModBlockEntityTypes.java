package net.wdfeer.accelerator.block;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wdfeer.accelerator.AcceleratorMod;

public class ModBlockEntityTypes {
    public static <T extends BlockEntity> BlockEntityType<T> RegisterBlockEntityType(String name, FabricBlockEntityTypeBuilder.Factory<T> factory, net.minecraft.block.Block block){
        return Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(AcceleratorMod.MOD_ID, name),
                FabricBlockEntityTypeBuilder.create(factory, block).build());
    }
    public static void Initialize() {}
}
