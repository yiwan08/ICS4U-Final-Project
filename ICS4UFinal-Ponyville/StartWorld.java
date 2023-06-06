import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.FileNotFoundException;

/**
 * Write a description of class StartWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWorld extends World
{
    private int count;
    /**
     * Constructor for objects of class StartWorld.
     * 
     */
    public StartWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 675, 1, false); 
        count = 0;
    }
    
    public void act(){
        if(count < 9){
            if(Greenfoot.isKeyDown("space")){
                count++;
                setBackground(new GreenfootImage(count+".jpg"));
            }
        }
        if(count==9){
            moveWorld();
        }
        
    }
    
    public void moveWorld(){
        Greenfoot.setWorld(new MainWorld());
    }
}
