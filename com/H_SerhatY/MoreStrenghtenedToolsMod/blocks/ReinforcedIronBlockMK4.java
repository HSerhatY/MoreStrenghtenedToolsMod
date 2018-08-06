package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedIronBlockMK4 extends BlockBase
{

	public ReinforcedIronBlockMK4(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(68.0F);
		setResistance(390.0F);
		setHarvestLevel("pickaxe", 15);
	}
	
}
