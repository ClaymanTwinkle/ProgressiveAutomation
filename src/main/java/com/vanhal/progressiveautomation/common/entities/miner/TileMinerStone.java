package com.vanhal.progressiveautomation.common.entities.miner;

import com.vanhal.progressiveautomation.common.util.ToolHelper;
import com.vanhal.progressiveautomation.common.upgrades.UpgradeType;

public class TileMinerStone extends TileMiner {

    public TileMinerStone() {
        super();
        setUpgradeLevel(ToolHelper.LEVEL_STONE);
        setAllowedUpgrades(UpgradeType.STONE, UpgradeType.WITHER, UpgradeType.COBBLE_GEN, UpgradeType.FILLER);
    }
}