package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Style;


public class ApartmentRoom {
    private final int maxCapacity;
    private InteriorDesign interiorDesign;
    private String roomId;


    public ApartmentRoom(String roomId, int maxCapacity, InteriorDesign interiorDesign) {
        this.interiorDesign = interiorDesign;
        this.maxCapacity = maxCapacity;
        this.roomId = roomId;
    }


    /**
     * TODO: finish implementation
     * add item to the room
     * @param decorItem
     * @return true if item was added; false - otherwise
     */
    public boolean addDecorItem(DecorItem decorItem) {
        /**
         * Business rules:
         *  - check if interiorDesign allows to add item
         *  - feel free to add variations (like limiting max number of items in the room)
         */
        throw new UnsupportedOperationException();
    }


    /**
     * TODO: finish implementation
     * @param decorItem
     * @return true if item was in the room, false otherwise
     */
    public boolean removeDecorItem(DecorItem decorItem) {
        /**
         * remove item
         */
        throw new UnsupportedOperationException();
    }


    /**
     * returns number of items in the room (current number of items, not max number)
     * @return
     */
    public int getNumberOfItems() {
        throw new UnsupportedOperationException();
    }


}
