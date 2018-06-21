package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.LoadSize;

import java.util.ArrayList;
import java.util.List;

public class LaundryLoad {
    private LaundryLoadSelector loadSelector;
    private LoadSize maxLoadSize;
    private List<WashableItem> washLoad = new ArrayList<>();


    public LaundryLoad(LaundryLoadSelector loadSelector, LoadSize maxLoadSize) {
        this.loadSelector = loadSelector;
        this.maxLoadSize = maxLoadSize;
    }


    /**
     * Business rules:
     *  - check if loadSelector allows to add item
     *  - make sure that number of items added does not exceed maxLoadSize:
     *      * map each maxLoadSize to number of items of your choosing, eg: SMALL_LOAD - up to 5 items, Medium -
     *        from 6 to 10, and so forth
     * @param washableItem
     * @return true if item was added; false - if there is still space, but item doesn't satisfy loadSelector conditions
     *         and throw an exception (eg, custom OutOfSpaceException) if there is no space left
     */
    public boolean addItem(WashableItem washableItem) {
        if (getLoadSize() >= maxLoadSize.numOfItems())
            throw new OutOfSpaceException("Item ["+washableItem+"] can't be added. Load is full");
        if (!loadSelector.doesMatchLoad(washableItem))    return false;
        washLoad.add(washableItem);
        return true;
    }


    /**
     * removes any item (eg, to free up space for another item
     * @return
     */
    public boolean removeAnyItem() {
        if (getLoadSize() == 0)     return false;
        washLoad.remove(washLoad.size()-1);
        return true;
    }


    /**
     * returns number of items in the load (current number of items, not max number)
     * @return
     */
    public int getLoadSize() {
        return washLoad.size();
    }

}
