package bjr1;
import java.util.*;

/**
 * The purpose of this class is to have a list of pre-made enemies that the game can pull from and put in the room for
 * the player to fight
 * This class will assign 3 moves to each enemy and their name
 */

public class EnemyList {

    // field declarations
    ArrayList<Enemy> eList = new ArrayList<>();

    /**
     * Constructor
     */

    // Methods

    /**
     * Method to set a new Enemy to the eList
     */
    void setNewEnemy(Enemy tempE){
        eList.add(tempE);
    }

    /**
     * Method to get a certain Enemy from the eList
     */
    Enemy getEnemy(int getThis){
        Enemy tempE = eList.get(getThis -1);
        return tempE;
    }

    /**
     * Method to get all the enemies in the eList
     */
    String getAllEnemies(){
        String tempEList = ", ";
        for(int num = 0; num <= eList.size(); num++){
            Enemy tempE = eList.get(num);
            tempEList = tempEList + ", ";
        }
        return tempEList;
    }

    /**
     * 
     */

}
