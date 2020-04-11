package com.AmazingRabbit.anoyingvillagerweapon.item;

import com.AmazingRabbit.anoyingvillagerweapon.AnoyingVillagerWeapon;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class PrismarineArmor extends ItemArmor {

    public static final ArmorMaterial PRISMARINEARMOR = EnumHelper.addArmorMaterial("prismarinearmor", AnoyingVillagerWeapon.MODID+":"+"prismarine", 99999999,
            new int[]{60, 60, 60, 60}, 100, SoundEvents.ENTITY_LIGHTNING_THUNDER,100);

    public PrismarineArmor(EntityEquipmentSlot equipmentSlotIn)
    {
        super(PRISMARINEARMOR,0,equipmentSlotIn);
    }
}
