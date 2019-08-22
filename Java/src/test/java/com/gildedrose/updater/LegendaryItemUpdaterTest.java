package com.gildedrose.updater;

import com.gildedrose.Item;
import com.gildedrose.MockItem;
import org.junit.Test;

import static com.gildedrose.updater.LegendaryItemUpdater.HIGHEST_QUALITY;
import static org.junit.Assert.*;

public class LegendaryItemUpdaterTest {

    private final Item sulfuras = MockItem.createSulfuras();

    @Test
    public void getNewQuality_shouldReturnAlways80_forSulfuras() {
        final ItemUpdater updater = ItemUpdaterFactory.getItemUpdater(sulfuras);
        assertTrue(updater instanceof SulfurasUpdater);

        assertEquals(HIGHEST_QUALITY, updater.getNewQuality());

        final int wrongQuality = 40;
        final ItemUpdater itemUpdater = ItemUpdaterFactory.getItemUpdater(new Item("Sulfuras, Hand of Ragnaros", 0, wrongQuality));
        assertEquals(HIGHEST_QUALITY, itemUpdater.getNewQuality());
    }
}