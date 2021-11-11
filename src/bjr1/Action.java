package bjr1;

/**
 * This is a child class of the Item class
 * This class will be held by the player and enemy in a list for them to sort and call for
 */

class Action extends Item{

    // field declarations

    /**
     * Constructor
     */
    Action(String newName, String newDes, int newUse, boolean newDeal, int newEffect){
        super(newName, newDes, newUse, newDeal, newEffect);
    }

    // Methods

}
