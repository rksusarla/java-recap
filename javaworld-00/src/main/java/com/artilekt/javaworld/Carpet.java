package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Style;

public class Carpet {
    private String originCountry;
    private String manufacturer;
    private String weavingTechnique;
    private String material;
    private int width, height;
    private Style style;

    public Carpet(String originCountry, String manufacturer, String weavingTechnique, String material,
                  int width, int height, Style style) {
        this.originCountry = originCountry;
        this.manufacturer = manufacturer;
        this.weavingTechnique = weavingTechnique;
        this.material  = material;
        this.width = width;
        this.height = height;
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getWeavingTechnique() {
        return weavingTechnique;
    }

    public String getMaterial() {
        return material;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
