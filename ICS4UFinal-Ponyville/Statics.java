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
     * sets the current level (map) of player. (1, 2, 3)
     * 
     * @param lv    The current level.
     */
    public static void setLevel(int lv){
        lV = lv;
    }
    
    /**
     * returns current level (1, 2, 3);
     * 
     * @return int  The current level
     */
    public static int getLevel(){
        return lV;
    }
    
    /**
     * sets the current coordinate of player
     * 
     * @param coord     The coordinate of player
     */
    public static void setPlayerCoords(int[] coord){
        ppX = coord[0];
        ppY = coord[1];
    }
    
    /**
     * returns player's X and Y coordinate on grid
     * 
     * @return int[2]  returns player's X and Y coordinate on grid, respectively
     */
    public static int[] getPlayerCoords(){
        return new int[]{ppX, ppY};
    }
}
