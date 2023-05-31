import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainCh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainCh extends SuperSmoothMover
{
    /**
     * Act - do whatever the MainCh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void move(){
        int x = getX(), y = getY();
        if(Greenfoot.isKeyDown("w")){
            y -= 2;
        }
        if(Greenfoot.isKeyDown("a")){
            x -= 2;
        }
        if(Greenfoot.isKeyDown("s")){
            y += 2;
        }
        if(Greenfoot.isKeyDown("d")){
            x += 2;
        }
        setLocation(x,y);
    }
}
