package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedIronBlockMK3 extends BlockBase
{

	public ReinforcedIronBlockMK3(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(36.0F);
		setResistance(205.0F);
		setHarvestLevel("pickaxe", 8);
	}
	
}
