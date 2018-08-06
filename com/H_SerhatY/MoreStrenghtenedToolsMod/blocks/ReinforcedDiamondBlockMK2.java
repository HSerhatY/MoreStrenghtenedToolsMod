package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedDiamondBlockMK2 extends BlockBase
{

	public ReinforcedDiamondBlockMK2(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(33.0F);
		setResistance(188.0F);
		setHarvestLevel("pickaxe", 20);
	}
	
}
