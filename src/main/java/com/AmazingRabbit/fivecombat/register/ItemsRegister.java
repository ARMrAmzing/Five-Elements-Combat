package com.AmazingRabbit.fivecombat.register;

import com.AmazingRabbit.fivecombat.item.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ItemsRegister {
    public static final ItemSword STEVEMEGASWORD = new SteveMegaSword();
    public static final ItemSword EXTRAENERGYSWORD = new ExtraEnergySword();
    public static final ItemArmor EMERALDHELMET = new EmeraldHelmet();
    public static final ItemArmor EMERALDCHESTPLATE = new EmeraldChestplate();
    public static final ItemArmor EMERALDLEGGINGS = new EmeraldLeggings();
    public static final ItemArmor EMERALDBOOTS = new EmeraldBoots();
    public static final ItemArmor PRISMARINEHELMET = new PrismarineHelmet();
    public static final ItemArmor PRISMARINECHESTPLATE = new PrismarineChestplate();
    public static final ItemArmor PRISMARINELEGGINGS = new PrismarineLeggings();
    public static final ItemArmor PRISMARINEBOOTS = new PrismarineBoots();
    public static final Item LEVEL1COMBATCORE = new Level1CombatCore();
    public static final Item LEVEL2COMBATCORE = new Level2CombatCore();
    public static final Item LEVEL3COMBATCORE = new Level3CombatCore();
    public static final Item REDDIAMOND = new RedDiamond();

    public ItemsRegister() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                STEVEMEGASWORD,EXTRAENERGYSWORD,PRISMARINEHELMET,PRISMARINECHESTPLATE,PRISMARINELEGGINGS,PRISMARINEBOOTS,LEVEL1COMBATCORE,LEVEL2COMBATCORE,LEVEL3COMBATCORE,
                EMERALDHELMET,EMERALDCHESTPLATE,EMERALDLEGGINGS,EMERALDBOOTS,REDDIAMOND
        );
    }
}