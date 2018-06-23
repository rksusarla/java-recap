package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Color;

public class LaundrySelectorByColor implements LaundryLoadSelector {
    private Color loadColor;

    public LaundrySelectorByColor(Color loadColor) {
        this.loadColor = loadColor;
    }

    @Override
    public boolean doesMatchLoad(WashableItem washableItem) {
        return washableItem.getColor() == loadColor;
    }
}
