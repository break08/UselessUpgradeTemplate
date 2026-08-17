package com.eznetherite.uselessupgradetemplate;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class UselessUpgradeTemplate {

    public UselessUpgradeTemplate(IEventBus eventBus) {

        Constants.LOG.info("Hello NeoForge world!");
        CommonClass.init();

    }
}