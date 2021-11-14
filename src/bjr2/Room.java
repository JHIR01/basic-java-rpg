package bjr2;

/**
 * The idea of this different version of the game is to see how building the game from the room to the smaller element
 * would be and whether it would be easier to do this instead of building it starting with the smaller things
 */

public class Room {

    // field declarations
    boolean northExit;
    boolean eastExit;
    boolean southExit;
    boolean westExit;

    /**
     * Constructor
     */
    Room(){

    }

    // Methods

    /**
     * Method to set the North exit of the Room
     */
    void setNorthExit(boolean newE){
        northExit = newE;
    }

    /**
     * Method to get the state of the North exit
     */
    boolean getNorthExit(){
        return northExit;
    }

    /**
     * Method to set the East exit of Room
     */
    void setEastExit(boolean newE){
        eastExit = newE;
    }

    /**
     * Method to get the state of the East exit
     */
    boolean getEastExit(){
        return eastExit;
    }

    /**
     * Method to set the South exit of the Room
     */
    void setSouthExit(boolean newE){
        southExit = newE;
    }

    /**
     * Method to get the state of the South exit
     */
    boolean getSouthExit(){
        return southExit;
    }

    /**
     * Method to set the West exit of the Room
     */
    void setWestExit(boolean newE){
        westExit = newE;
    }

    /**
     * Method to get the state of the West exit
     */
    boolean getWestExit(){
        return westExit;
    }

}
