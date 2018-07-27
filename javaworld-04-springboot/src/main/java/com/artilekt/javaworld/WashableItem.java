package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Color;
import com.artilekt.javaworld.enums.WashCycle;
import com.artilekt.javaworld.enums.WaterTemperature;

public interface WashableItem {
    Color getColor();
    WaterTemperature getWaterTemperature();
    WashCycle getWashCycle();

}
