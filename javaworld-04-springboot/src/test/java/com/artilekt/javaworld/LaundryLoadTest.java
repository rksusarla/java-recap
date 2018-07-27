package com.artilekt.javaworld;


import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static com.artilekt.javaworld.enums.Color.*;
import static com.artilekt.javaworld.enums.LoadSize.SMALL_LOAD;
import static com.artilekt.javaworld.enums.Size.SMALL;
import static com.artilekt.javaworld.enums.Style.ANTIQUE;
import static com.artilekt.javaworld.enums.Style.MODERN;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LaundryLoadTest {
    private Carpet ANTIQUE_CARPET = new Carpet("Iran", "unknown", "hand woven", "wool", 100, 100, ANTIQUE);
    private Carpet ANTIQUE_CARPET2 = new Carpet("Iraq", "unknown", "hand woven", "wool", 100, 100, ANTIQUE);
    private Carpet ANTIQUE_CARPET3 = new Carpet("KSA", "unknown", "hand woven", "wool", 100, 100, ANTIQUE);
    private Carpet MODERN_CARPET = new Carpet("Iran", "unknown", "hand woven", "wool", 100, 100, MODERN);
    private Shirt WHITE_SHIRT = new Shirt(SMALL, WHITE);
    private Shirt BLACK_SHIRT = new Shirt(SMALL, BLACK);
    private Shirt COLORED_SHIRT = new Shirt(SMALL, COLORED);
    private Shirt COLORED_SHIRT2 = new Shirt(SMALL, COLORED);
    private Shirt COLORED_SHIRT3 = new Shirt(SMALL, COLORED);

    private LaundryLoadSelector COLOR_MATCH = new LaundrySelectorByColor(COLORED);


    @Before
    public void setup() {

    }

    @Test
    public void addLaundryToLoadColorMatch() {
        LaundryLoad laundryLoad = new LaundryLoad(COLOR_MATCH, SMALL_LOAD);
        assertTrue(laundryLoad.addItem(ANTIQUE_CARPET));
        assertTrue(laundryLoad.addItem(MODERN_CARPET));
        assertTrue(laundryLoad.addItem((COLORED_SHIRT)));
        assertFalse(laundryLoad.addItem(WHITE_SHIRT));
    }


    @Test(expected = OutOfSpaceException.class)
    public void loadOverCapacity() {
        LaundryLoad laundryLoad = new LaundryLoad(COLOR_MATCH, SMALL_LOAD);
        laundryLoad.addItem(ANTIQUE_CARPET);
        laundryLoad.addItem(ANTIQUE_CARPET2);
        laundryLoad.addItem(ANTIQUE_CARPET3);
        laundryLoad.addItem(MODERN_CARPET);
        laundryLoad.addItem(COLORED_SHIRT);
        laundryLoad.addItem(COLORED_SHIRT2);
    }

}