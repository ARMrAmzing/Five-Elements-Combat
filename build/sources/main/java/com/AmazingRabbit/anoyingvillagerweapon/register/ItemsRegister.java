package com.AmazingRabbit.anoyingvillagerweapon.register;

import com.AmazingRabbit.anoyingvillagerweapon.item.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class ItemsRegister {
    public static final ItemSword STEVEMEGASWORD = new SteveMegaSword();
    public static final ItemArmor PRISMARINECHESTPLATE = new PrismarineChestplate();
    public static final Item LEVEL1COMBATCORE = new Level1CombatCore();
    public static final Item LEVEL2COMBATCORE = new Level2CombatCore();
    public static final Item LEVEL3COMBATCORE = new Level3CombatCore();

    public ItemsRegister() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                STEVEMEGASWORD,PRISMARINECHESTPLATE,LEVEL1COMBATCORE,LEVEL2COMBATCORE,LEVEL3COMBATCORE
        );
    }
}