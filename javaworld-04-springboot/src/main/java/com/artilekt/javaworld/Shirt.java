package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Color;
import com.artilekt.javaworld.enums.Size;
import com.artilekt.javaworld.enums.WashCycle;
import com.artilekt.javaworld.enums.WaterTemperature;

import static com.artilekt.javaworld.enums.WashCycle.REGULAR_WASH;
import static com.artilekt.javaworld.enums.WaterTemperature.HIGH_TEMP;
import static com.artilekt.javaworld.enums.WaterTemperature.LOW_TEMP;

public class Shirt implements WashableItem {
    private Size shirtSize;
    private Color color;

    public Shirt(Size shirtSize, Color color) {
        this.shirtSize = shirtSize;
        this.color = color;
    }


    public Size getShirtSize() {
        return shirtSize;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public WaterTemperature getWaterTemperature() {
        WaterTemperature temp;
        switch (color) {
            case WHITE:
                temp = HIGH_TEMP;
                break;
            default:
                temp = LOW_TEMP;
                break;
        }
        return temp;
    }

    @Override
    public WashCycle getWashCycle() {
        return REGULAR_WASH;
    }
}
