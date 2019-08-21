package com.gildedrose.updater;

public class AgedBrieUpdater extends CustomItemUpdater {

    public AgedBrieUpdater() {
    }

    @Override
    void updateSellIn() {
        item.sellIn -= 1;
    }

    @Override
    boolean canUpdateQuality() {
        return item.quality < HIGHEST_QUALITY;
    }

    @Override
    int getUpdateValue() {
        return INCREASE_NORMAL;
    }
}
