package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedCobblestoneMK3 extends BlockBase 
{

	public ReinforcedCobblestoneMK3(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(8.0F);
		setResistance(102.0F);
		setHarvestLevel("pickaxe", 5);
	}
	
}
