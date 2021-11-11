package bjr1;

/**
 * The 'Item' class will hold information such as
 * - item's name
 * - item's description
 * - item's usage/durability
 * - whether the item deals damage or not
 * - the numeral effect of the item
 */

public class Item {

    // field declarations
    String name;
    String description;
    int usage;
    boolean deal;
    int effect;

    /**
     * Constructor
     */

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

}
