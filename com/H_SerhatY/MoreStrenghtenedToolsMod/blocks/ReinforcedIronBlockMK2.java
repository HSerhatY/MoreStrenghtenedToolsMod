package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedIronBlockMK2 extends BlockBase
{

	public ReinforcedIronBlockMK2(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(19.0F);
		setResistance(108.0F);
		setHarvestLevel("pickaxe", 8);
	}
	
}
