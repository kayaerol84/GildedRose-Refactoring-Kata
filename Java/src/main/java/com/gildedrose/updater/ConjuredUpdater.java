package com.gildedrose.updater;

public class ConjuredUpdater extends StandardItemUpdater {

    public ConjuredUpdater() {
    }

    @Override
    int getUpdateValue() {
        if (item.sellIn < 0) {
            return DEGRADE_TWICE_AS_FAST * 2;
        } else {
            return DEGRADE_TWICE_AS_FAST;
        }
    }
}
