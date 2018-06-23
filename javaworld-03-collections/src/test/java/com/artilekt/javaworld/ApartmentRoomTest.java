package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Color;
import com.artilekt.javaworld.enums.Style;
import com.sun.org.apache.xerces.internal.dom.AttrNSImpl;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static com.artilekt.javaworld.enums.Color.BLACK;
import static com.artilekt.javaworld.enums.Color.COLORED;
import static com.artilekt.javaworld.enums.Color.WHITE;
import static com.artilekt.javaworld.enums.Size.SMALL;
import static com.artilekt.javaworld.enums.Style.ANTIQUE;
import static com.artilekt.javaworld.enums.Style.MODERN;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ApartmentRoomTest {
    private Carpet ANTIQUE_CARPET = new Carpet("Iran", "unknown", "hand woven", "wool", 100, 100, ANTIQUE);
    private Carpet MODERN_CARPET = new Carpet("Iran", "unknown", "hand woven", "wool", 100, 100, MODERN);
    private Painting MODERN_PAINTING = new Painting("Chagall", LocalDate.of(1920, 01, 25), 100, 100, MODERN);
    private Painting ANTIQUE_PAINTING = new Painting("Chagall", LocalDate.of(1920, 01, 25), 100, 100, ANTIQUE);

    private InteriorDesign MATCH_BY_STYLE_ANTIQUE = new MatchByStyleInteriorDesign(Style.ANTIQUE);

    @Before
    public void setup() {

    }

    @Test
    public void addRoomsToApartmentStyleMatch() {
        ApartmentRoom room = new ApartmentRoom("first room", 10, MATCH_BY_STYLE_ANTIQUE);
        assertTrue(room.addDecorItem(ANTIQUE_CARPET));
        assertTrue(room.addDecorItem(ANTIQUE_PAINTING));
        assertFalse(room.addDecorItem(MODERN_CARPET));
    }




}