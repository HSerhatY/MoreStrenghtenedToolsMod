package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedEmeraldBlockMK2 extends BlockBase
{

	public ReinforcedEmeraldBlockMK2(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(38.0F);
		setResistance(219.0F);
		setHarvestLevel("pickaxe", 30);
	}
	
}
