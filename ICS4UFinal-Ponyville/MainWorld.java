import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MainWorld here.
 * Music (Stage 1 BGM): https://archive.org/details/Bandcamp-2194848856
 * 
 * @author Xuanxi Jiang
 * @version (a version number or a date)
 */
public class MainWorld extends World{
    ShaderBox[][] sb;
    private CoordMap mp;
    private int prevPlayerX, prevPlayerY;
    private LinkedList<int[]> prv = new LinkedList<int[]>();
    private MainCh chara;
    private GreenfootSound bgmL1, bgmL2, bgmL3;
    
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
        //Delete this line when implementing multi-world
        Statics.setLevel(1);
        bgmL1 = new GreenfootSound("field_of_hopes.mp3");
        bgmL1.setVolume(100);
        chara = new MainCh();
        addObject(chara, 0, 0);
        addObject(new Panel(), 1200/2, (getMap().getSz()[1]+4)/2);
        setBackground("BackGround/FarmLand.jpg");
        setPaintOrder(Panel.class, ShaderBox.class, MainCh.class);
        update();
    }
    
    public CoordMap getMap(){
        return mp;
    }
    
    public void act(){
        if(chara.isMoving() || chara.getMagic()>0)
            update();
    }
    
    public void started(){
        music();
    }
    
    public void stopped(){
        unMusic();
    }
    
    private void unMusic(){
        switch(Statics.getLevel()){
            case 1:
                bgmL1.pause();
                break;
        }
    }
    
    private void music(){
        switch(Statics.getLevel()){
            case 1:
                bgmL1.playLoop();
                break;
        }
    }
    
    private void update(){
        for(int[] i:prv)
            sb[i[0]][i[1]].iluminate(0);
        prv.clear();
        int[] currCoords = Statics.getPlayerCoords();
        for(int i=-2; i<=2; i++){
            for(int j=-2; j<=2; j++){
                int[] tmp = {currCoords[0]+i, currCoords[1]+j};
                if(tmp[0]>=0 && tmp[1]>=0 && tmp[0]<20 && tmp[1]<11){
                    if(SparkleEngine.ManhattenDistance(tmp, currCoords)<=2){
                        prv.add(tmp);
                        int normBright = 100-(SparkleEngine.ManhattenDistance(tmp, Statics.getPlayerCoords()))*33;
                        sb[tmp[0]][tmp[1]].iluminate(Math.max(normBright, chara.getMagic()));
                    }
                }
            }
        }
    }
}
