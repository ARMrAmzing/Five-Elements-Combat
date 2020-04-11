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

public class EmeraldArmor extends ItemArmor {

    public static final ArmorMaterial EMERALDARMOR = EnumHelper.addArmorMaterial("emeraldarmor", FiveCombat.MODID+":"+"emerald", 1200,
            new int[]{20, 20, 20, 20}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,10);

    public EmeraldArmor(EntityEquipmentSlot equipmentSlotIn)
    {
        super(EMERALDARMOR,0,equipmentSlotIn);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack item) {
        player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 20, 0));
    }
}
