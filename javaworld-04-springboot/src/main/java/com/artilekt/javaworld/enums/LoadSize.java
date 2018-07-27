package com.artilekt.javaworld.enums;

public enum LoadSize {
    SMALL_LOAD(5), MEDIUM_LOAD(10), LARGE_LOAD(20), EXTRA_LARGE_LOAD(30);

    private int numOfItems = 0;

    LoadSize(int numOfItems) { this.numOfItems = numOfItems; }

    public int numOfItems() { return numOfItems; }
}
