package com.AmazingRabbit.anoyingvillagerweapon.item;

import com.AmazingRabbit.anoyingvillagerweapon.AnoyingVillagerWeapon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Level2CombatCore extends Item {
    private static final String name = "lv2_combatcore";
    public Level2CombatCore(){
        this.setRegistryName(name);
        this.setUnlocalizedName(AnoyingVillagerWeapon.MODID+"."+name);
        this.setCreativeTab(CreativeTabs.MISC);
    }
}
