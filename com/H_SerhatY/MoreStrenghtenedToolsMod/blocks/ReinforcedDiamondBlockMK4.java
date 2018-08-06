package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedDiamondBlockMK4 extends BlockBase
{

	public ReinforcedDiamondBlockMK4(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(208.0F);
		setResistance(1175.0F);
		setHarvestLevel("pickaxe", 125);
	}
	
}
