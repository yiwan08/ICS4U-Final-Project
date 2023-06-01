import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainCh here.
 * 
 * @author Xuanxi Jiang
 * @version (a version number or a date)
 */
public class MainCh extends SuperSmoothMover{
    /**
     * Act - do whatever the MainCh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        this.setImage("TheHeart.png");
        move();
    }
    
    public void move(){
        int x = getX(), y = getY();
        int[] gridPos = ((MainWorld)getWorld()).getMap().getMaps(new int[]{x, y});
        if(Greenfoot.isKeyDown("w")){
            if(gridPos[1]-1>=0)
                gridPos[1]--;
        }
        if(Greenfoot.isKeyDown("a")){
            if(gridPos[0]-1>=0)
                gridPos[0]--;
        }
        if(Greenfoot.isKeyDown("s")){
            if(gridPos[1]+1<11)
                gridPos[1]++;
        }
        if(Greenfoot.isKeyDown("d")){
            if(gridPos[0]+1<20)
                gridPos[0]++;
        }
        int[] realPos = ((MainWorld)getWorld()).getMap().getPixes(gridPos);
        setLocation(realPos[0],realPos[1]);
        Statics.setPlayerCoords(new int[]{gridPos[0], gridPos[1]});
    }
    
    
}
