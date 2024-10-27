package com.accbdd.farmers_croptopia;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(FarmersCroptopia.MODID)
public class FarmersCroptopia
{
    public static final String MODID = "farmers_croptopia";
    private static final Logger LOGGER = LogUtils.getLogger();

    public FarmersCroptopia(FMLJavaModLoadingContext context)
    {
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }
}
