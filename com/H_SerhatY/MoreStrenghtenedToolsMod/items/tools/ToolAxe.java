package com.H_SerhatY.MoreStrenghtenedToolsMod.items.tools;

import com.H_SerhatY.MoreStrenghtenedToolsMod.Main;
import com.H_SerhatY.MoreStrenghtenedToolsMod.init.ModItems;
import com.H_SerhatY.MoreStrenghtenedToolsMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel{

	public ToolAxe(String name, ToolMaterial material, int n)
	{
		super(material, n, -3.0F);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
