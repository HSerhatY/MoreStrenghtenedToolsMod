package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedGoldBlockMK1 extends BlockBase
{

	public ReinforcedGoldBlockMK1(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(4.0F);
		setResistance(36.0F);
		setHarvestLevel("pickaxe", 1);
	}
	
}
