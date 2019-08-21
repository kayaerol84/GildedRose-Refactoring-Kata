package com.gildedrose.updater;

import com.gildedrose.Item;

public abstract class ItemUpdater {
    public static int HIGHEST_QUALITY = 50;
    public static int MIN_QUALITY = 0;
    static int DEGRADE_NORMAL = -1;
    static int DEGRADE_TWICE_AS_FAST = -2;
    static int INCREASE_NORMAL = 1;
    static int INCREASE_TWICE_AS_FAST = 2;
    static int INCREASE_THRICE_AS_FAST = 3;

    Item item;
    ItemUpdater() {}

    public void updateStateFor(){
        updateSellIn();
        updateQuality();
    }

    abstract void updateSellIn();
    abstract boolean canUpdateQuality();
    abstract int getUpdateValue();
    abstract int getNewQuality();

    private void updateQuality() {
        if (canUpdateQuality()) {
            item.quality = Math.max(getNewQuality(), MIN_QUALITY);
        }
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
