package com.gildedrose;

import com.gildedrose.updater.ItemUpdater;
import com.gildedrose.updater.ItemUpdaterFactory;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdaterFactory.getItemUpdater(item)
                    .updateStateFor();

        }
    }
}