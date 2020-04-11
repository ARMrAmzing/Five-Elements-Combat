package com.AmazingRabbit.anoyingvillagerweapon;

import com.AmazingRabbit.anoyingvillagerweapon.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = AnoyingVillagerWeapon.MODID, name = AnoyingVillagerWeapon.NAME, version = AnoyingVillagerWeapon.VERSION)
public class AnoyingVillagerWeapon
{
    public static final String MODID = "anoyingvillagerweapon";
    public static final String NAME = "Anoying Villager Weapon";
    public static final String VERSION = "20200401b";

    @Mod.Instance(AnoyingVillagerWeapon.MODID)
    public static AnoyingVillagerWeapon instance;

    @SidedProxy(clientSide = "com.AmazingRabbit.anoyingvillagerweapon.proxy.ClientProxy",serverSide = "com.AmazingRabbit.anoyingvillagerweapon.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}