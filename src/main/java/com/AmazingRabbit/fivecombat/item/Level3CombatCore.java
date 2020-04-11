package com.AmazingRabbit.fivecombat.item;

import com.AmazingRabbit.fivecombat.FiveCombat;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Level3CombatCore extends Item {
    private static final String name = "lv3_combatcore";
    public Level3CombatCore(){
        this.setRegistryName(name);
        this.setUnlocalizedName(FiveCombat.MODID+"."+name);
        this.setCreativeTab(CreativeTabs.MISC);
    }
}
