package com.eznetherite.uselessupgradetemplate;

import net.fabricmc.api.ModInitializer;

public class UselessUpgradeTemplate implements ModInitializer {
    
    @Override
    public void onInitialize() {
        
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
    }
}
