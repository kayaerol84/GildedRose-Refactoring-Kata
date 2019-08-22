package com.gildedrose;

import com.gildedrose.updater.LegendaryItemUpdater;

import static com.gildedrose.updater.ItemUpdater.HIGHEST_QUALITY;
import static com.gildedrose.updater.ItemUpdater.MIN_QUALITY;

public class MockItem {
    public static Item createLowQuality(String name){
        return new Item(name, 0, MIN_QUALITY + 1);
    }

    public static Item createHighQuality(String name){
        return new Item(name, 5, HIGHEST_QUALITY);
    }

    public static Item createStandard(int sellIn, int quality){
        return new Item("Standard", sellIn, quality);
    }

    public static Item createLowQuality(String name, int sellIn){
        return new Item(name, sellIn, MIN_QUALITY + 1);
    }

    public static Item createSulfuras() {
        return new Item("Sulfuras, Hand of Ragnaros", 0, LegendaryItemUpdater.HIGHEST_QUALITY);
    }
}
