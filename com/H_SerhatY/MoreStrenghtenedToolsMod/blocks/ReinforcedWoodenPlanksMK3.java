package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedWoodenPlanksMK3 extends BlockBase 
{

	public ReinforcedWoodenPlanksMK3(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.WOOD);
		setHardness(5.0F);
		setResistance(34.0F);
		setHarvestLevel("axe", 0);
	}
	
}
