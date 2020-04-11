package com.AmazingRabbit.fivecombat;

import com.AmazingRabbit.fivecombat.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = FiveCombat.MODID, name = FiveCombat.NAME, version = FiveCombat.VERSION)
public class FiveCombat
{
    public static final String MODID = "fivecombat";
    public static final String NAME = "Five Combat";
    public static final String VERSION = "20200401b";

    @Mod.Instance(FiveCombat.MODID)
    public static FiveCombat instance;

    @SidedProxy(clientSide = "com.AmazingRabbit.fivecombat.proxy.ClientProxy",serverSide = "com.AmazingRabbit.fivecombat.proxy.CommonProxy")
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