package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedRedstoneBlockMK4 extends BlockBase 
{

	public ReinforcedRedstoneBlockMK4(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(26.0F);
		setResistance(252.0F);
		setHarvestLevel("pickaxe", 15);
	}
	
}
