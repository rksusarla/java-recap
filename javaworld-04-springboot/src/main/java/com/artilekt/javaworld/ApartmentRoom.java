package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApartmentRoom {
    private final int maxCapacity;
    private String roomId;
    private List<DecorItem> decor = new ArrayList<>();

    @Autowired
    private InteriorDesign interiorDesign;


    public ApartmentRoom(String roomId, int maxCapacity, InteriorDesign interiorDesign) {
        this.interiorDesign = interiorDesign;
        this.maxCapacity = maxCapacity;
        this.roomId = roomId;
    }

    public ApartmentRoom() {
        this.maxCapacity = 10;
        this.roomId = "defaultRoom";
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
