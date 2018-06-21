package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Color;

public class LaundryLoad {
    private Color loadColor;

    public LaundryLoad(Color loadColor) {
        this.loadColor = loadColor;
    }

    /**
     *
     * @param washableItem item
     * @return true if item matches the load, false otherwise
     */
    public boolean addToLoad(WashableItem washableItem) {
        return washableItem.getColor() == loadColor;
    }
}
