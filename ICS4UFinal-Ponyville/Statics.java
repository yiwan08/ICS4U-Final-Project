/**
 * A class that stores static variables, could potentially be used for game saves.
 * 
 * @author Xuanxi Jiang
 * @version 0.1
 */
public class Statics{
    //Current level (from 1 to 3), player position x, player position y.
    //Note: ppX and ppY are coordinates of Map, 
    private static int lV, ppX, ppY;
    
    /**
     * returns current level (1, 2, 3);
     * 
     * @return int  The current level
     */
    public static int getLevel(){
        return lV;
    }
    
    /**
     * returns player's X coordinate on grid
     * 
     * @return int  returns player's X coordinate on grid
     */
    public static int getPlayerCoordX(){
        return ppX;
    }
    
    /**
     * returns player's Y coordinate on grid
     * 
     * @return int  returns player's Y coordinate on grid
     */
    public static int getPlayerCoordY(){
        return ppY;
    }
}
