package com.AmazingRabbit.fivecombat.item;

import com.AmazingRabbit.fivecombat.FiveCombat;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class PrismarineHelmet extends PrismarineArmor
{
    private static String name = "prismarinehelmet";
    public PrismarineHelmet()
    {
        super(EntityEquipmentSlot.HEAD);
        this.setRegistryName(name);
        this.setUnlocalizedName(FiveCombat.MODID + "." + name);
        this.setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if(flagIn.isAdvanced()){
            tooltip.add("§1水");
            tooltip.add("");
            tooltip.add("§9动力");
            tooltip.add("§5史诗");
            tooltip.add("");
            tooltip.add("§4溺尸的无敌战甲");
            tooltip.add("§4让整个世界颤抖");
            tooltip.add("§e毁灭罪恶吧！！！");
            tooltip.add("§9Him制造");
        }
        else{
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".1." + "desc"));
            tooltip.add("");
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".3." + "desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".4." + "desc"));
            tooltip.add("");
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".6." + "desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".7." + "desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".8." + "desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".9." + "desc"));
        }
    }

    /*@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        EntityPlayer player = playerIn;
        player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        float hp = player.getHealth();
        player.setHealth(hp-10);
        player.setItemStackToSlot(EntityEquipmentSlot.CHEST,itemstack);
        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_LIGHTNING_THUNDER, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }*/
}
