package com.AmazingRabbit.fivecombat.item;

import com.AmazingRabbit.fivecombat.FiveCombat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class PrismarineArmor extends ItemArmor {

    public static final ArmorMaterial PRISMARINEARMOR = EnumHelper.addArmorMaterial("prismarinearmor", FiveCombat.MODID+":"+"prismarine", 99999999,
            new int[]{60, 60, 60, 60}, 100, SoundEvents.ENTITY_LIGHTNING_THUNDER,100);

    public PrismarineArmor(EntityEquipmentSlot equipmentSlotIn)
    {
        super(PRISMARINEARMOR,0,equipmentSlotIn);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack item) {
        player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 1));
    }
}
