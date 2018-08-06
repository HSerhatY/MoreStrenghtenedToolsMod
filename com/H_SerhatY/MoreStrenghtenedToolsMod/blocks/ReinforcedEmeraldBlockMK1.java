package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedEmeraldBlockMK1 extends BlockBase
{

	public ReinforcedEmeraldBlockMK1(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(14.0F);
		setResistance(81.0F);
		setHarvestLevel("pickaxe", 11);
	}
	
}
