package bjr1;

import java.util.*;

/**
 * This class will be the skeleton for the enemy class and the play class to hold information about both
 * - hold actions
 * - hold items
 * - vitality
 */

class Entity {

    // field declarations
    ArrayList<Action> actionList = new ArrayList<>();
    ArrayList<Item> itemList = new ArrayList<>();
    int lifePoints;

    /**
     * Constructor
     */
    public Entity(){

    }

    // Methods

    /**
     * Method to add a new Action to the actionList
     */
    void addNewAction(String aN, String aD, int aU, boolean aDeal, int aE){
        Action tempA = new Action(aN, aD, aU, aDeal, aE);
        actionList.add(tempA);
    }

    /**
     * Method to set a new Action to the actionList
     */
    void setNewAction(Action tempA){
        actionList.add(tempA);
    }

    /**
     * Method to get information about all the actions in the actionList
     */
    void getAction(int getThis){
        Item tempAction = actionList.get(getThis -1);
        tempAction.printItem();
    }

    /**
     * Method to add a new Item to the itemList
     */
    void addNewItem(String iN, String iD, int iU, boolean iDeal, int iE){
        Item tempI = new Item(iN, iD, iU, iDeal, iE);
        itemList.add(tempI);
    }

    /**
     * Method to set the lifePoints of the Entity
     */
    void setLifePoints(int newLP){
        lifePoints = newLP;
    }

    /**
     * Method to get the information about all the items in the itemList
     */
    void getItem(int getThis){
        Item tempI = itemList.get(getThis -1);
        tempI.printItem();
    }

    /**
     * Method to get the lifePoint of the Entity
     */
    int getLifePoints(){
        return lifePoints;
    }

    /**
     * Method to print information about the Entity
     */

//    /**
//     * toString
//     */
//    @Override
//    public String toString(){
//
//    }

}
