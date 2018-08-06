package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedLapisBlockMK1 extends BlockBase
{

	public ReinforcedLapisBlockMK1(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(7.0F);
		setResistance(21.0F);
		setHarvestLevel("pickaxe", 1);
	}
	
}
