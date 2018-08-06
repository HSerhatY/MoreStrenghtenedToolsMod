package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedWoodenPlanksMK2 extends BlockBase 
{

	public ReinforcedWoodenPlanksMK2(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.WOOD);
		setHardness(4.0F);
		setResistance(26.0F);
		setHarvestLevel("axe", 0);
	}
	
}
