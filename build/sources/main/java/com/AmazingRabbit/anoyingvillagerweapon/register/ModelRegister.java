package com.AmazingRabbit.anoyingvillagerweapon.register;

import com.AmazingRabbit.anoyingvillagerweapon.register.ItemsRegister;
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
        registerItemModel(ItemsRegister.PRISMARINECHESTPLATE);
        registerItemModel(ItemsRegister.LEVEL1COMBATCORE);
        registerItemModel(ItemsRegister.LEVEL2COMBATCORE);
        registerItemModel(ItemsRegister.LEVEL3COMBATCORE);
    }
    private void registerItemModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
