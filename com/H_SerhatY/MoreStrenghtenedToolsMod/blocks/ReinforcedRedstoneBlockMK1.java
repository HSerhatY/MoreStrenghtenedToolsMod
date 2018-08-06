package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedRedstoneBlockMK1 extends BlockBase
{

	public ReinforcedRedstoneBlockMK1(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(51.0F);
		setHarvestLevel("pickaxe", 3);
	}
	
}
