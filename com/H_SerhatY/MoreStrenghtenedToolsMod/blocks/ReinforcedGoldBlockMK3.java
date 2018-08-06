package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedGoldBlockMK3 extends BlockBase
{

	public ReinforcedGoldBlockMK3(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(6.0F);
		setResistance(52.0F);
		setHarvestLevel("pickaxe", 1);
	}
	
}
