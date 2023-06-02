import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainCh here.
 * 
 * @author Xuanxi Jiang
 * @version (a version number or a date)
 */
public class MainCh extends SuperSmoothMover{
    
    private int[] realPos, prevPos;
    private double[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int dir, xx;
    private final double spd = 1;
    private boolean moving;
    
    public void addedToWorld(World w){
        prevPos = new int[]{getX(), getY()};
        realPos = new int[]{getX(), getY()};
        moving = false;
        dir = -1;
        xx = 0;
        int[] gridPos = ((MainWorld)getWorld()).getMap().getMaps(new int[]{getX(), getY()});
        int[] Mid = ((MainWorld)w).getMap().getPixes(((MainWorld)w).getMap().getMaps(gridPos));
        setLocation(Mid[0], Mid[1]);
    }
    
    public void act(){
        this.setImage("TheHeart.png");
        move();
    }
    
    public void move(){
        int x = getX(), y = getY();
        int[] gridPos = ((MainWorld)getWorld()).getMap().getMaps(new int[]{x, y});
        if(!moving){
            xx = 0;
            if(Greenfoot.isKeyDown("w")){
                if(gridPos[1]-1>=0){
                    gridPos[1]--;
                    realPos = ((MainWorld)getWorld()).getMap().getPixes(gridPos);
                    moving = true;
                    dir = 2;
                }
            }else if(Greenfoot.isKeyDown("a")){
                if(gridPos[0]-1>=0){
                    gridPos[0]--;
                    realPos = ((MainWorld)getWorld()).getMap().getPixes(gridPos);
                    moving = true;
                    dir = 0;
                }
            }else if(Greenfoot.isKeyDown("s")){
                if(gridPos[1]+1<11){
                    gridPos[1]++;
                    realPos = ((MainWorld)getWorld()).getMap().getPixes(gridPos);
                    moving = true;
                    dir = 3;
                }
            }else if(Greenfoot.isKeyDown("d")){
                if(gridPos[0]+1<20){
                    gridPos[0]++;
                    realPos = ((MainWorld)getWorld()).getMap().getPixes(gridPos);
                    moving = true;
                    dir = 1;
                }
            }
        }
        if(dir==1 || dir==3){
            if(prevPos[0]+dirs[dir][0]*spd*xx<=realPos[0] && prevPos[1]+dirs[dir][1]*spd*xx<=realPos[1]){
                setLocation((double)prevPos[0]+dirs[dir][0]*spd*xx, (double)prevPos[1]+dirs[dir][1]*spd*xx);
                xx++;
            }else{
                moving = false;
                dir = -1;
                xx = 0;
                setLocation(realPos[0], realPos[1]);
                System.out.println(dir);
                Statics.setPlayerCoords(new int[]{gridPos[0], gridPos[1]});
                prevPos = realPos.clone();
            }
        }else if(dir==0 || dir==2){
            if(prevPos[0]+dirs[dir][0]*spd*xx>=realPos[0] && prevPos[1]+dirs[dir][1]*spd*xx>=realPos[1]){
                setLocation((double)prevPos[0]+dirs[dir][0]*spd*xx, (double)prevPos[1]+dirs[dir][1]*spd*xx);
                xx++;
            }else{
                moving = false;
                dir = -1;
                xx = 0;
                setLocation(realPos[0], realPos[1]);
                prevPos = realPos.clone();
            }
        }
        Statics.setPlayerCoords(new int[]{gridPos[0], gridPos[1]});
    }
}
