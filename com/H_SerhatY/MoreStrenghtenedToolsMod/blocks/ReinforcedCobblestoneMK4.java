package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedCobblestoneMK4 extends BlockBase 
{

	public ReinforcedCobblestoneMK4(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(12.0F);
		setResistance(153.0F);
		setHarvestLevel("pickaxe", 8);
	}
	
}
