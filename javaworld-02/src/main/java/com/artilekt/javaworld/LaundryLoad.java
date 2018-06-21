package com.artilekt.javaworld;

import com.artilekt.javaworld.enums.LoadSize;

public class LaundryLoad {
    private LaundryLoadSelector loadSelector;
    private LoadSize maxLoadSize;


    public LaundryLoad(LaundryLoadSelector loadSelector, LoadSize maxLoadSize) {
        this.loadSelector = loadSelector;
        this.maxLoadSize = maxLoadSize;
    }


    /**
     * TODO: finish implementation
     * @param washableItem
     * @return true if item was added; false - if there is still space, but item doesn't satisfy loadSelector conditions
     *         and throw an exception (eg, custom OutOfSpaceException) if there is no space left
     */
    public boolean addItem(WashableItem washableItem) {
        /**
         * Business rules:
         *  - check if loadSelector allows to add item
         *  - make sure that number of items added does not exceed maxLoadSize:
         *      * map each maxLoadSize to number of items of your choosing, eg: SMALL_LOAD - up to 5 items, Medium -
         *        from 6 to 10, and so forth
         */
        throw new UnsupportedOperationException();
    }



    /**
     * removes any item (eg, to free up space for another item
     * @return
     */
    public boolean removeAnyItem() {
        throw new UnsupportedOperationException();
    }


    /**
     * returns number of items in the load (current number of items, not max number)
     * @return
     */
    public int getLoadSize() {
        throw new UnsupportedOperationException();
    }

}
