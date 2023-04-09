package net.wdfeer.accelerator.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.wdfeer.accelerator.block.BlockData;
import net.wdfeer.accelerator.block.BlockModelType;
import net.wdfeer.accelerator.block.ModBlockEntityTypes;
import net.wdfeer.accelerator.block.ModBlocks;
import net.wdfeer.accelerator.block.entity.AcceleratorEntity;
import net.wdfeer.accelerator.util.TextLine;
import org.jetbrains.annotations.Nullable;

public class Accelerator extends ModBlockWithEntity {
    protected Accelerator() {
        super(FabricBlockSettings.of(Material.STONE).strength(5f, 30f).requiresTool());
    }

    @Override
    public BlockEntityType<? extends AcceleratorEntity> getBlockEntityType() {
        return blockEntityType;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, getBlockEntityType(), AcceleratorEntity::tick);
    }

    public static Block instance;
    public static BlockEntityType<AcceleratorEntity> blockEntityType;
    public static void Initialize(){
        instance = ModBlocks.RegisterBlock("accelerator",
                new Accelerator(),
                new BlockData(BlockModelType.CubeBottomTop),
                ItemGroup.DECORATIONS,
                new TextLine[]{new TextLine("Range: 3x3x3", Formatting.YELLOW), new TextLine("Boost: +100%", Formatting.YELLOW)});
        blockEntityType = ModBlockEntityTypes.RegisterBlockEntityType("accelerator_entity",
                AcceleratorEntity::new,
                instance);

//        AdvancedAccelerator.instance = ModBlocks.RegisterBlock("advanced_accelerator",
//                new AdvancedAccelerator(),
//                new BlockData(BlockModelType.CubeTopSameBottom),
//                ItemGroup.DECORATIONS,
//                new TextLine[]{new TextLine("Range: 5x5x5", Formatting.GRAY), new TextLine("Speed: +2x", Formatting.GRAY)});
//        AdvancedAccelerator.blockEntityType = ModBlockEntityTypes.RegisterBlockEntityType("advanced_accelerator_entity",
//                AdvancedAcceleratorEntity::new,
//                AdvancedAccelerator.instance);
//
//        UltimateAccelerator.instance = ModBlocks.RegisterBlock("ultimate_accelerator",
//                new UltimateAccelerator(),
//                new BlockData(BlockModelType.CubeTopSameBottom),
//                ItemGroup.DECORATIONS,
//                new TextLine[]{new TextLine("Range: 7x7x7", Formatting.GRAY), new TextLine("Speed: +4x", Formatting.GRAY)});
//        UltimateAccelerator.blockEntityType = ModBlockEntityTypes.RegisterBlockEntityType("ultimate_accelerator_entity",
//                UltimateAcceleratorEntity::new,
//                UltimateAccelerator.instance);
    }
}
