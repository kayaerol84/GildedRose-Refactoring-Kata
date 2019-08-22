package com.gildedrose.updater;

import com.gildedrose.Item;
import com.gildedrose.MockItem;
import org.junit.Test;

import static com.gildedrose.updater.ItemUpdater.HIGHEST_QUALITY;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomItemUpdaterTest {

    private final Item backstageItem = MockItem.createHighQuality("Backstage passes to a TAFKAL80ETC concert");
    private final Item agedBrieItem = MockItem.createHighQuality("Aged Brie");

    private final Item backstageItemWithLowQuality = MockItem.createLowQuality("Backstage passes to a TAFKAL80ETC concert", 15);
    private final Item agedBrieItemWithLowQuality = MockItem.createLowQuality("Aged Brie");

    @Test
    public void getNewQuality_shouldReturnHighestValue_forBackstageWithHighQuality() {
        final ItemUpdater updater = ItemUpdaterFactory.getItemUpdater(backstageItem);
        assertTrue(updater instanceof BackstagePassUpdater);

        assertEquals(HIGHEST_QUALITY, updater.getNewQuality());
    }

    @Test
    public void getNewQuality_shouldReturnHighestValue_forAgedBrieWithHighQuality() {
        final ItemUpdater updater = ItemUpdaterFactory.getItemUpdater(agedBrieItem);
        assertTrue(updater instanceof AgedBrieUpdater);


        assertEquals(HIGHEST_QUALITY, updater.getNewQuality());
    }

    @Test
    public void getNewQuality_shouldReturnIncreasedValue_forBackstageWithLowQuality() {
        final ItemUpdater updater = ItemUpdaterFactory.getItemUpdater(backstageItemWithLowQuality);
        assertTrue(updater instanceof BackstagePassUpdater);

        assertEquals(backstageItemWithLowQuality.quality + 1, updater.getNewQuality());
    }

    @Test
    public void getNewQuality_shouldReturnIncreasedValue_forAgedBrieWithLowQuality() {
        final ItemUpdater updater = ItemUpdaterFactory.getItemUpdater(agedBrieItemWithLowQuality);
        assertTrue(updater instanceof AgedBrieUpdater);

        assertEquals(agedBrieItemWithLowQuality.quality + 1, updater.getNewQuality());
    }
}