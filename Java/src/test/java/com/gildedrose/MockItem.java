package com.gildedrose;

import static com.gildedrose.updater.ItemUpdater.HIGHEST_QUALITY;
import static com.gildedrose.updater.ItemUpdater.MIN_QUALITY;

public class MockItem {
    public static Item createLowQuality(String name){
        return new Item(name, 0, MIN_QUALITY + 1);
    }

    public static Item createHigQuality(String name){
        return new Item(name, 5, HIGHEST_QUALITY);
    }
}
