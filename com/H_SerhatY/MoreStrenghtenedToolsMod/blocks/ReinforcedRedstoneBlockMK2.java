package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedRedstoneBlockMK2 extends BlockBase 
{

	public ReinforcedRedstoneBlockMK2(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(9.0F);
		setResistance(87.0F);
		setHarvestLevel("pickaxe", 5);
	}
	
}
