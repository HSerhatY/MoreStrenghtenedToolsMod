package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedGoldBlockMK2 extends BlockBase
{

	public ReinforcedGoldBlockMK2(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(43.0F);
		setHarvestLevel("pickaxe", 1);
	}
	
}
