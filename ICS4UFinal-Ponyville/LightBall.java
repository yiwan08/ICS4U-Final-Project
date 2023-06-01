import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LightBall here.
 * 
 * @author George Lu
 * @version (a version number or a date)
 */
public class LightBall extends StraightDart
{
    private GreenfootImage lightBall, panel;
    private Color color;
    private boolean side;//This boolean will determine if this lightBall is from enemy
    public LightBall(boolean side){
        lightBall = new GreenfootImage("RedBall.png");
        lightBall.scale(15,15);
        setImage(lightBall);
        this.side = side;
        color = new Color(0,0,0);
        panel.drawRect(400, 300, 100, 100);
        
        
    }
    /**
     * Act - do whatever the LightBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setRotation(270);
        move(2);
    }
    
    public boolean getSide(){
        return side;
    }
}
