package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedLapisBlockMK4 extends BlockBase 
{

	public ReinforcedLapisBlockMK4(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(20.0F);
		setResistance(57.0F);
		setHarvestLevel("pickaxe", 1);
	}
	
}
