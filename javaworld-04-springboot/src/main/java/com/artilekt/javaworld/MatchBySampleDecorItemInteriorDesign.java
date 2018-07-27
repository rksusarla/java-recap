package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Style;

public class MatchBySampleDecorItemInteriorDesign implements InteriorDesign {
    private DecorItem sampleItem;

    public MatchBySampleDecorItemInteriorDesign(DecorItem sampleItem) {
        this.sampleItem = sampleItem;
    }

    /**
     * style must match + size of the decorItem should be same or smaller than size of 'sampleItem'
     * @param decorItem
     * @return
     */
    @Override
    public boolean doesMatchInterior(DecorItem decorItem) {
        return sampleItem.getItemStyle() == decorItem.getItemStyle() &&
               sampleItem.getItemSize().compareTo(decorItem.getItemSize()) >= 0;
    }

}
