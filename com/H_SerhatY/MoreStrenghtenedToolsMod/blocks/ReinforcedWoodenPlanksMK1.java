package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedWoodenPlanksMK1 extends BlockBase 
{

	public ReinforcedWoodenPlanksMK1(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.WOOD);
		setHardness(3.0F);
		setResistance(20.0F);
		setHarvestLevel("axe", 0);
	}
	
}
