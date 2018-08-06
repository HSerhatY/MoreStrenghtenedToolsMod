package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedCobblestoneMK1 extends BlockBase
{

	public ReinforcedCobblestoneMK1(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(45.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
}
