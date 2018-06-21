package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Style;

import java.util.ArrayList;
import java.util.List;

public class ApartmentRoom {
    private final int maxCapacity;
    private InteriorDesign interiorDesign;
    private String roomId;
    private List<DecorItem> decor = new ArrayList<>();

    public ApartmentRoom(String roomId, int maxCapacity, InteriorDesign interiorDesign) {
        this.interiorDesign = interiorDesign;
        this.maxCapacity = maxCapacity;
        this.roomId = roomId;
    }


    /**
     * add item to the room
     * business rules:
     *  - check if interiorDesign allows to add item
     *  - feel free to add variations (like limiting max number of items in the room)
     *
     * @param decorItem
     * @return true if item was added; false - otherwise
     */
    public boolean addDecorItem(DecorItem decorItem) {
        if (getNumberOfItems() >= maxCapacity)
            throw new OutOfSpaceException("Item ["+decorItem+"] can't be added. Room ["+roomId+"] does not have any more space left");
        if (!interiorDesign.doesMatchInterior(decorItem))    return false;
        decor.add(decorItem);
        return true;
    }


    /**
     * @param decorItem
     * @return
     */
    public boolean removeDecorItem(DecorItem decorItem) {
        return decor.remove(decorItem);
    }


    /**
     * returns number of items in the room (current number of items, not max number)
     * @return
     */
    public int getNumberOfItems() {
        return decor.size();
    }


}
