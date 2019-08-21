package com.gildedrose.updater;

import com.gildedrose.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ItemUpdaterFactory {

    private static final Map<String, ItemUpdater> registeredItemUpdaters = new HashMap<>();

    static {
        registeredItemUpdaters.put("Aged Brie", new AgedBrieUpdater());
        registeredItemUpdaters.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassUpdater());
        registeredItemUpdaters.put("Sulfuras, Hand of Ragnaros", new SulfurasUpdater());
        registeredItemUpdaters.put("Conjured Mana Cake", new ConjuredUpdater());
    }

    public static void registerCustomUpdater(final String type, final ItemUpdater updater){
        registeredItemUpdaters.put(type, updater);
    }

    public static ItemUpdater getItemUpdater(final Item item) {
        ItemUpdater itemUpdater = Optional.ofNullable(registeredItemUpdaters.get(item.name))
                .orElse(new StandardItemUpdater());
        itemUpdater.setItem(item);

        return itemUpdater;
    }
}
