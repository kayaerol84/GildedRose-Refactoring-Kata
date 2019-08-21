package com.gildedrose.updater;

public abstract class LegendaryItemUpdater extends ItemUpdater{
    static int HIGHEST_QUALITY = 80;

    public LegendaryItemUpdater() {
    }

    int getNewQuality(){
        return Math.min(item.quality + getUpdateValue(), HIGHEST_QUALITY);
    }
}
