import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Panel here.
 * 
 * @author Xuanxi Jiang
 * @version (a version number or a date)
 */
public class Panel extends Actor{
    GreenfootImage base;
    private int maxX, maxY;
    private Label HPVal, MPVal, ColectVal;
    
    public void addedToWorld(World w){
        base = new GreenfootImage("Banner.jpg");
        maxX = 1200; maxY = ((MainWorld)getWorld()).getMap().getSz()[1]+4;
        base.scale(maxX, maxY);
        setImage(base);
        HPVal = new Label("HP: ", 30);
        MPVal = new Label("MP: ", 30);
        ColectVal = new Label("Memory Orb Collected: ", 30);
        w.addObject(HPVal, 60, maxY/2);
        w.addObject(MPVal, maxX/3, maxY/2);
        refresh();
    }
    
    public void act(){
        
    }
    
    public void refresh(){
        
    }
}
