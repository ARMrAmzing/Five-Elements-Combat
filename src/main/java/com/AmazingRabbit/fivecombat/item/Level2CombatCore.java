package com.AmazingRabbit.fivecombat.item;

import com.AmazingRabbit.fivecombat.FiveCombat;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Level2CombatCore extends Item {
    private static final String name = "lv2_combatcore";
    public Level2CombatCore(){
        this.setRegistryName(name);
        this.setUnlocalizedName(FiveCombat.MODID+"."+name);
        this.setCreativeTab(CreativeTabs.MISC);
    }
}
