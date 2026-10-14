package com.simongroebner65.maxfpsmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaxFPSMod implements ModInitializer {
    public static final String MOD_ID = "maxfpsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing MaxFPSMod");
        // Initialize your mod here
    }

    public void onEnable() {
        LOGGER.info("Enabling MaxFPSMod");
        // Enable your mod here
    }

    public void onDisable() {
        LOGGER.info("Disabling MaxFPSMod");
        // Disable your mod here
    }

    public void onStop() {
        LOGGER.info("Stopping MaxFPSMod");
        // Stop your mod here
    }
}