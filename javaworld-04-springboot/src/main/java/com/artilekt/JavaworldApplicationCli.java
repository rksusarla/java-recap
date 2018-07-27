package com.artilekt;

import com.artilekt.javaworld.*;
import com.artilekt.javaworld.enums.Color;
import com.artilekt.javaworld.enums.LoadSize;
import com.artilekt.javaworld.enums.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

import static com.artilekt.javaworld.enums.Color.*;
import static com.artilekt.javaworld.enums.Size.SMALL;
import static com.artilekt.javaworld.enums.Style.ANTIQUE;
import static com.artilekt.javaworld.enums.Style.MODERN;


public class JavaworldApplicationCli {
    private Carpet ANTIQUE_CARPET = new Carpet("Iran", "unknown", "hand woven", "wool", 100, 100, ANTIQUE);
    private Carpet MODERN_CARPET = new Carpet("Iran", "unknown", "hand woven", "wool", 100, 100, MODERN);
    private Painting MODERN_PAINTING = new Painting("Chagall", LocalDate.of(1920, 01, 25), 100, 100, MODERN);
    private Painting ANTIQUE_PAINTING = new Painting("Chagall", LocalDate.of(1920, 01, 25), 100, 100, ANTIQUE);

    private Carpet ANTIQUE_CARPET2 = new Carpet("Iraq", "unknown", "hand woven", "wool", 100, 100, ANTIQUE);
    private Carpet ANTIQUE_CARPET3 = new Carpet("KSA", "unknown", "hand woven", "wool", 100, 100, ANTIQUE);
    private Shirt WHITE_SHIRT = new Shirt(SMALL, WHITE);
    private Shirt BLACK_SHIRT = new Shirt(SMALL, BLACK);
    private Shirt COLORED_SHIRT = new Shirt(SMALL, COLORED);
    private Shirt COLORED_SHIRT2 = new Shirt(SMALL, COLORED);
    private Shirt COLORED_SHIRT3 = new Shirt(SMALL, COLORED);


    private ApartmentRoom room;

    private LaundryLoad laundryLoad;


    public static void main(String[] args) {
        JavaworldApplicationCli cli = new JavaworldApplicationCli();

        cli.setup();

        cli.run();
    }

    public void setup() {
        Style defaultStyle = ANTIQUE;
        InteriorDesign defaultDesign = new MatchByStyleInteriorDesign(defaultStyle);
        room = new ApartmentRoom("defaultRoom", 10, defaultDesign);

        LoadSize defaultLoadSize = LoadSize.MEDIUM_LOAD;
        Color defaultColor = COLORED;
        LaundryLoadSelector defaultLoadSelector = new LaundrySelectorByColor(defaultColor);
        laundryLoad = new LaundryLoad(defaultLoadSelector, defaultLoadSize);
    }

    public void run() {
        System.out.println("Adding items to room...");
        room.addDecorItem(ANTIQUE_CARPET);
        room.addDecorItem(ANTIQUE_PAINTING);
        room.addDecorItem(MODERN_CARPET);
        System.out.println("number of items in the room: "+room.getNumberOfItems());
        System.out.println();

        System.out.println("Adding items to laundry load...");
        laundryLoad.addItem(ANTIQUE_CARPET);
        laundryLoad.addItem(MODERN_CARPET);
        laundryLoad.addItem((COLORED_SHIRT));
        laundryLoad.addItem(WHITE_SHIRT);
        System.out.println("number of items in the laundry load: "+laundryLoad.getLoadSize());
    }
}
