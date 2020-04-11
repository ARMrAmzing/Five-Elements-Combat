package com.AmazingRabbit.anoyingvillagerweapon.item;

import com.AmazingRabbit.anoyingvillagerweapon.AnoyingVillagerWeapon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Level1CombatCore extends Item {
    private static final String name = "lv1_combatcore";
    public Level1CombatCore(){
        this.setRegistryName(name);
        this.setUnlocalizedName(AnoyingVillagerWeapon.MODID+"."+name);
        this.setCreativeTab(CreativeTabs.MISC);
    }
}
