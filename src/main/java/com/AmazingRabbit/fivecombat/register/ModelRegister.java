package com.AmazingRabbit.fivecombat.register;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModelRegister {
    public ModelRegister(){
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void registerItemModels(ModelRegistryEvent event) {
        registerItemModel(ItemsRegister.STEVEMEGASWORD);
        registerItemModel(ItemsRegister.EMERALDHELMET);
        registerItemModel(ItemsRegister.EMERALDCHESTPLATE);
        registerItemModel(ItemsRegister.EMERALDLEGGINGS);
        registerItemModel(ItemsRegister.EMERALDBOOTS);
        registerItemModel(ItemsRegister.PRISMARINEHELMET);
        registerItemModel(ItemsRegister.PRISMARINECHESTPLATE);
        registerItemModel(ItemsRegister.PRISMARINELEGGINGS);
        registerItemModel(ItemsRegister.PRISMARINEBOOTS);
        registerItemModel(ItemsRegister.LEVEL1COMBATCORE);
        registerItemModel(ItemsRegister.LEVEL2COMBATCORE);
        registerItemModel(ItemsRegister.LEVEL3COMBATCORE);
        registerItemModel(ItemsRegister.REDDIAMOND);
    }
    private void registerItemModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
