package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MatchByStyleInteriorDesign implements InteriorDesign {
    private Style style;

    @Autowired
    public MatchByStyleInteriorDesign(Style style) {
        this.style = style;
    }

    @Override
    public boolean doesMatchInterior(DecorItem decorItem) {
        return style == decorItem.getItemStyle();
    }

}
