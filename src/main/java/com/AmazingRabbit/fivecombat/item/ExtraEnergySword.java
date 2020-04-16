package com.AmazingRabbit.fivecombat.item;

import com.AmazingRabbit.fivecombat.FiveCombat;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

import java.util.List;

public class ExtraEnergySword extends ItemSword {

    public static final ToolMaterial EXTRAENERGYSWORD = EnumHelper.addToolMaterial("extraenergysword", 1, 99999, 5.0F, 40.0F, 1000);
    private static String name = "extraenergysword";
    int i = 0;

    public ExtraEnergySword() {
        super(EXTRAENERGYSWORD);
        this.setRegistryName(name);
        this.setUnlocalizedName(FiveCombat.MODID + "." + name);
        this.setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if(flagIn.isAdvanced()){
            tooltip.add("§f§l雷电");
            tooltip.add("");
            tooltip.add("§4天谴");
            tooltip.add("§5贪婪");
            tooltip.add("§d施法");
            tooltip.add("§6无双");
            tooltip.add("");
            tooltip.add("§e§l一把来自深渊的剑");
            tooltip.add("§c§l相传秦始皇和亚历山大大帝都用过这把剑");
            tooltip.add("§d§l你会感到它充满了能量");
            tooltip.add("§7§lGaster制造");
        }
        else{
            tooltip.add(I18n.format(this.getUnlocalizedName()+".1."+"desc"));
            tooltip.add("");
            tooltip.add(I18n.format(this.getUnlocalizedName()+".3."+"desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName()+".4."+"desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName()+".5."+"desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName()+".6."+"desc"));
            tooltip.add("");
            tooltip.add(I18n.format(this.getUnlocalizedName()+".8."+"desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName()+".9."+"desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName()+".10."+"desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName()+".11."+"desc"));
        }
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        target.attackEntityFrom(DamageSource.LIGHTNING_BOLT, 8.0F);
        attacker.heal(3);
        World world = attacker.world;
        world.playSound((EntityPlayer) null, attacker.posX, attacker.posY, attacker.posZ, SoundEvents.ENTITY_LIGHTNING_THUNDER,SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        i++;
        if(i == 10){
            target.addPotionEffect(new PotionEffect(MobEffects.WITHER,1,5));
            world.playSound((EntityPlayer) null, attacker.posX, attacker.posY, attacker.posZ, SoundEvents.ENTITY_WITHER_DEATH ,SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
            i = 0;
        }
        return true;
    }
}
