package com.gildedrose.updater;

public abstract class CustomItemUpdater extends ItemUpdater{

    public CustomItemUpdater() {
    }

    int getNewQuality(){
        return Math.min(item.quality + getUpdateValue(), HIGHEST_QUALITY);
    }
}
