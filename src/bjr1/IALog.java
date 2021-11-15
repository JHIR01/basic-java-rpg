package bjr1;
import java.util.*;

/**
 * This class hold pre-made actions and items in different lists
 */

public class IALog {

    // field declaration
    HashMap<String, Action> actionMap = new HashMap<String, Action>();
    HashMap<String, Item> itemMap = new HashMap<String, Item> ();

    /**
     * Constructor
     */

    // Methods

    /**
     * Method to add a new action to the actionMap
     */
    void addToActionMap(Action tempA){
        String tempAN = tempA.getName();
        actionMap.put(tempAN, tempA);
    }

    /**
     * Method to add a new item to the itemMap
     */
    void addToItemMap(Item tempI){
        String tempAN = tempI.getName();
        itemMap.put(tempAN, tempI);
    }

    /**
     * Method to preset the ActionList with new 
     */

}
