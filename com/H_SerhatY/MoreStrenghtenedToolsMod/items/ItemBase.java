package com.H_SerhatY.MoreStrenghtenedToolsMod.items;

import com.H_SerhatY.MoreStrenghtenedToolsMod.Main;
import com.H_SerhatY.MoreStrenghtenedToolsMod.init.ModItems;
import com.H_SerhatY.MoreStrenghtenedToolsMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
