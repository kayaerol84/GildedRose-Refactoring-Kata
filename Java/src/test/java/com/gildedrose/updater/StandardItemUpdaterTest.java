package com.gildedrose.updater;

import com.gildedrose.Item;
import com.gildedrose.MockItem;
import org.junit.Before;
import org.junit.Test;

import static com.gildedrose.updater.ItemUpdater.DEGRADE_NORMAL;
import static com.gildedrose.updater.ItemUpdater.HIGHEST_QUALITY;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StandardItemUpdaterTest {
    private final int originalSellin = 5;
    private final int originalQuality = HIGHEST_QUALITY;
    private final Item standardItem = MockItem.createStandard(originalSellin, originalQuality);
    private ItemUpdater updater;

    @Before
    public void setUp() {
        updater = ItemUpdaterFactory.getItemUpdater(standardItem);
        assertTrue(updater instanceof StandardItemUpdater);
    }

    @Test
    public void updateSellIn() {
        updater.updateSellIn();
        assertEquals(originalSellin - 1, standardItem.sellIn);
    }

    @Test
    public void canUpdateQuality() {
        assertTrue(updater.canUpdateQuality());
    }

    @Test
    public void getUpdateValue() {
        assertEquals(DEGRADE_NORMAL, updater.getUpdateValue());
    }

    @Test
    public void getNewQuality() {
        assertEquals(originalQuality-1, updater.getNewQuality());
    }
}