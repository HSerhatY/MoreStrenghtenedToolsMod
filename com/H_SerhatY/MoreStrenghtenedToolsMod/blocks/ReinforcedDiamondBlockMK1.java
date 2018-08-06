package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedDiamondBlockMK1 extends BlockBase
{

	public ReinforcedDiamondBlockMK1(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(13.0F);
		setResistance(75.0F);
		setHarvestLevel("pickaxe", 8);
	}
	
}
