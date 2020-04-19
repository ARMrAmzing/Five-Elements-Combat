package com.AmazingRabbit.fivecombat.item;

import com.AmazingRabbit.fivecombat.FiveCombat;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

import java.util.List;

public class EmeraldSword extends ItemSword {

    public static final ToolMaterial EMERALDSWORD = EnumHelper.addToolMaterial("emeraldsword", 1, 1000, 5.0F, 20.0F, 30);
    private static String name = "emeraldsword";

    public EmeraldSword() {
        super(EMERALDSWORD);
        this.setRegistryName(name);
        this.setUnlocalizedName(FiveCombat.MODID + "." + name);
        this.setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if (flagIn.isAdvanced()) {
            tooltip.add("§6木");
            tooltip.add("");
            tooltip.add("§6觉醒");
            tooltip.add("§b传奇");
            tooltip.add("");
            tooltip.add("§e格雷夫的神圣战剑");
            tooltip.add("§e让村民王国颤抖");
            tooltip.add("§c从爱尔兰到契丹无人不晓");
            tooltip.add("§8反抗者联盟制造");
        } else {
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
}
