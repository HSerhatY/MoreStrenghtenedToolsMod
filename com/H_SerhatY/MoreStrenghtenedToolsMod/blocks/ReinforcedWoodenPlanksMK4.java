package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedWoodenPlanksMK4 extends BlockBase 
{

	public ReinforcedWoodenPlanksMK4(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.WOOD);
		setHardness(7.0F);
		setResistance(44.0F);
		setHarvestLevel("axe", 0);
	}
	
}
