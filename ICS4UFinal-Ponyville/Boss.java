import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemy
{
    private GreenfootImage ball;
    private int direction, time;
    private boolean exist, reverse;
    public Boss(){
        ball = new GreenfootImage("blackball.png");
        ball.scale(35,35);
        setImage(ball);
        time = 0;
    
    }
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(direction == 180){
            direction--;
        }else{
            direction++;
        }
        
        if(exist){
            roundShoot();
        }
        time--;
    }
    
    public void addedToWorld(World w){
        exist = true;
    }
    
    public void roundShoot(){
        if(time % 5 == 0){
            getWorld().addObject(new LightBall(false, direction), getX(), getY());
        }
        
    
    }
}
