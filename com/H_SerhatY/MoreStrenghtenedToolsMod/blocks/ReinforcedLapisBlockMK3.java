package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedLapisBlockMK3 extends BlockBase 
{

	public ReinforcedLapisBlockMK3(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(14.0F);
		setResistance(41.0F);
		setHarvestLevel("pickaxe", 1);
	}
	
}
