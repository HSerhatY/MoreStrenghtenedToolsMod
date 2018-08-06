package com.H_SerhatY.MoreStrenghtenedToolsMod.items.tools;

import com.H_SerhatY.MoreStrenghtenedToolsMod.Main;
import com.H_SerhatY.MoreStrenghtenedToolsMod.init.ModItems;
import com.H_SerhatY.MoreStrenghtenedToolsMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel{

	public ToolSpade(String name, ToolMaterial material)
	{
		super(material);
		
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
