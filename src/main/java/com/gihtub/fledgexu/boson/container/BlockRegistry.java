package com.gihtub.fledgexu.boson.container;

import com.gihtub.fledgexu.boson.Utils;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> obsidianFirstContainerBlock = BLOCKS.register("obsidian_first_container", ObsidianFirstContainerBlock::new);
}
