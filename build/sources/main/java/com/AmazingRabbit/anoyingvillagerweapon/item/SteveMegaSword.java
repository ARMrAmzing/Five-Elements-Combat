package com.AmazingRabbit.anoyingvillagerweapon.item;

import com.AmazingRabbit.anoyingvillagerweapon.AnoyingVillagerWeapon;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

import java.util.List;

public class SteveMegaSword extends ItemSword {
    public static final ToolMaterial STEVEMEGASWORD = EnumHelper.addToolMaterial("stevemegasword", 1, 5000, 5.0F, 60.0F, 100);
    private static String name = "stevemegasword";

    public SteveMegaSword() {
        super(STEVEMEGASWORD);
        this.setRegistryName(name);
        this.setUnlocalizedName(AnoyingVillagerWeapon.MODID + "." + name);
        this.setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if(flagIn.isAdvanced()){
        tooltip.add("");
        tooltip.add("§e振作");
        tooltip.add("§5史诗");
        tooltip.add("");
        tooltip.add("§4史蒂夫的无敌战刃");
        tooltip.add("§4Him看到了都害怕");
        tooltip.add("§bNotch制造");
        }
        else{
            tooltip.add(I18n.format(this.getUnlocalizedName()+".1."+"desc"));
        }
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        EntityPlayer player = playerIn;
        float hp = player.getHealth();

        if(hp <= 4) {
            int i = player.experienceLevel;
            if (i >= 30) {
                player.addExperienceLevel(-5);
                player.setHealth(12);
                worldIn.playSound((EntityPlayer) null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ELDER_GUARDIAN_CURSE, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
            }
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);

    }
}