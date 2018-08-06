package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedGoldBlockMK4 extends BlockBase
{

	public ReinforcedGoldBlockMK4(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(7.0F);
		setResistance(62.0F);
		setHarvestLevel("pickaxe", 1);
	}
	
}
