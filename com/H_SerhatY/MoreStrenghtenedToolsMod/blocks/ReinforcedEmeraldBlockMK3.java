package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedEmeraldBlockMK3 extends BlockBase
{

	public ReinforcedEmeraldBlockMK3(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(103.0F);
		setResistance(591.0F);
		setHarvestLevel("pickaxe", 81);
	}
	
}
