package com.H_SerhatY.MoreStrenghtenedToolsMod.items.tools;

import com.H_SerhatY.MoreStrenghtenedToolsMod.Main;
import com.H_SerhatY.MoreStrenghtenedToolsMod.init.ModItems;
import com.H_SerhatY.MoreStrenghtenedToolsMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{

	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
