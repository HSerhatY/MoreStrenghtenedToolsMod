package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedEmeraldBlockMK4 extends BlockBase
{

	public ReinforcedEmeraldBlockMK4(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(278.0F);
		setResistance(1596.0F);
		setHarvestLevel("pickaxe", 219);
	}
	
}
