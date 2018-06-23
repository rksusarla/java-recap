package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Style;

public class MatchByStyleInteriorDesign implements InteriorDesign {
    private Style style;

    public MatchByStyleInteriorDesign(Style style) {
        this.style = style;
    }

    @Override
    public boolean doesMatchInterior(DecorItem decorItem) {
        return style == decorItem.getItemStyle();
    }

}
