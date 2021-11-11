package bjr1;

/**
 * The 'Item' class will hold information such as
 * - item's name
 * - item's description
 * - item's usage/durability
 * - whether the item deals damage or not
 * - the numeral effect of the item
 */

class Item {

    // field declarations
    String name;
    String description;
    int usage;
    boolean deal; // determines whether the Item will deal damage
    int effect; // This is a numeral value of what the Item will have when used on a player or the enemy

    /**
     * Constructor
     */
    public Item(String newName, String newDes, int newUse, boolean newDeal, int newEffect){
        setName(newName);
        setDescription(newDes);
        setUsage(newUse);
        setDeal(newDeal);
        setEffect(newEffect);
    }

    // Methods

    /**
     * Method to set the name of the Item
     */
    void setName(String newName){
        name = newName;
    }

    /**
     * Method to get the name of the Item
     */
    String getName(){
        return name;
    }

    /**
     * Method to set the description of the Item
     */
    void setDescription(String newDes){
        description = newDes;
    }

    /**
     * Method to get the description of the Item
     */
    String getDescription(){
        return description;
    }

    /**
     * Method to set the usage/durability of the Item
     */
    void setUsage(int newUse){
        usage = newUse;
    }

    /**
     * Method to get the usage/durability of the Item
     */
    int getUsage(){
        return usage;
    }

    /**
     * Method to set the deal of the Item
     */
    void setDeal(boolean newDeal){
        deal = newDeal;
    }

    /**
     * Method to get the deal of the Item
     */
    boolean getDeal(){
        return deal;
    }

    /**
     * Method to set the effect of the Item
     */
    void setEffect(int newE){
        effect = newE;
    }

    /**
     * Method to get the effect of the Item
     */
    int getEffect(){
        return effect;
    }

    /**
     * Method to print information about the Item
     */
    void printItem(){
        System.out.println(toString());
    }

    /**
     * toString
     */
    @Override
    public String toString(){
        String returnThis =
                "Name: " + name
                + "\nDescription: " + description
                + "\nUsage/Durability: " + usage
                + "\nDeal: " + deal
                + "\nEffect: " + effect;
        return returnThis;
    }

}
