package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedDiamondBlockMK3 extends BlockBase
{

	public ReinforcedDiamondBlockMK3(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(83.0F);
		setResistance(470.0F);
		setHarvestLevel("pickaxe", 50);
	}
	
}
