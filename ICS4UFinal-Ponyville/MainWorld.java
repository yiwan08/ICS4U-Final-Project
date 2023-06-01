import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MainWorld here.
 * 
 * @author Xuanxi Jiang
 * @version (a version number or a date)
 */
public class MainWorld extends World{
    ShaderBox[][] sb;
    private CoordMap mp;
    private int prevPlayerX, prevPlayerY;
    private LinkedList<int[]> prv = new LinkedList<int[]>();
    
    public MainWorld(){
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 675, 1, false);
        sb = new ShaderBox[20][11];
        mp = new CoordMap(Statics.getLevel(), 20, 11, 1200, 675);
        for(int i=0; i<20; i++){
            for(int j=0; j<11; j++){
                sb[i][j] = new ShaderBox(mp.getSz()[0], mp.getSz()[1]);
                addObject(sb[i][j], mp.getPixes(new int[]{i, j})[0], mp.getPixes(new int[]{i, j})[1]);
            }
        }
        addObject(new MainCh(), 400, 300);
        setBackground("BackGround/FarmLand.jpg");
        setPaintOrder(ShaderBox.class, MainCh.class);
    }
    
    public CoordMap getMap(){
        return mp;
    }
    
    public void act(){
        for(int[] i:prv)
            sb[i[0]][i[1]].iluminate(0);
        prv.clear();
        for(int i=0; i<20; i++){
            for(int j=0; j<11; j++){
                int[] tmp = {i, j};
                if(SparkleEngine.ManhattenDistance(tmp, Statics.getPlayerCoords())<=2){
                    prv.add(tmp);
                    sb[i][j].iluminate(100-(SparkleEngine.ManhattenDistance(tmp, Statics.getPlayerCoords()))*33);
                }
            }
        }
    }
    
    private void update(){
        
    }
}
