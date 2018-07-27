package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LaundrySelectorByColor implements LaundryLoadSelector {
    private Color loadColor;

    @Autowired
    public LaundrySelectorByColor(Color loadColor) {
        this.loadColor = loadColor;
    }

    @Override
    public boolean doesMatchLoad(WashableItem washableItem) {
        return washableItem.getColor() == loadColor;
    }
}
