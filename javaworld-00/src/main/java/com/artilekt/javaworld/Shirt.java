package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Color;
import com.artilekt.javaworld.enums.Size;

public class Shirt {
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
}
