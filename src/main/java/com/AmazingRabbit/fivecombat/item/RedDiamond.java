package com.AmazingRabbit.fivecombat.item;

import com.AmazingRabbit.fivecombat.FiveCombat;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RedDiamond extends Item {
    private static final String name = "red_diamond";
    public RedDiamond(){
        this.setRegistryName(name);
        this.setUnlocalizedName(FiveCombat.MODID+"."+name);
        this.setCreativeTab(CreativeTabs.MISC);
    }
}
