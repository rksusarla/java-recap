package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Style;

public class ApartmentRoom {
    private Style roomStyle;

    public ApartmentRoom(Style roomStyle) {
        this.roomStyle = roomStyle;
    }

    /**
     * returns true if item matches the room; rules can be different - matching by size or style
     * @return
     */
    public boolean decorateRoomWith(DecorItem item) {
        return item.getItemStyle() == roomStyle;
    }
}
