package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedIronBlockMK1 extends BlockBase
{

	public ReinforcedIronBlockMK1(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(10.0F);
		setResistance(57.0F);
		setHarvestLevel("pickaxe", 4);
	}
	
}
