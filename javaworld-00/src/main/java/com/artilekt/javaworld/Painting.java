package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Style;

import java.time.LocalDate;

public class Painting {
    private String    artistName;
    private LocalDate dateCreated;
    private int width, height;
    private Style style;

    public Painting(String artistName, LocalDate dateCreated, int width, int height, Style style) {
        this.artistName = artistName;
        this.dateCreated = dateCreated;
        this.width = width;
        this.height = height;
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public String getArtistName() {
        return artistName;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
