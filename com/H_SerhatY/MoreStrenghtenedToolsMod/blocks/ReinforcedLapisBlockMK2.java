package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedLapisBlockMK2 extends BlockBase 
{

	public ReinforcedLapisBlockMK2(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(10.0F);
		setResistance(29.0F);
		setHarvestLevel("pickaxe", 1);
	}
	
}
