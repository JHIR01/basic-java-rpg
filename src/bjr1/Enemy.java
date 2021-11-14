package bjr1;

public class Enemy extends Entity{

    // field declarations
    String eName;

    /**
     * Constructor
     */
    Enemy(int newLP){
        super(newLP);
    }

    // Methods

    /**
     * Method to set the name of the Enemy
     */
    void setEName(String newEName){
        eName = newEName;
    }

    /**
     * Method to get the name of the Enemy
     */
    String getEName(){
        return eName;
    }

}
