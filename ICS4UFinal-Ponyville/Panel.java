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
    
    public void addedToWorld(World w){
        base = new GreenfootImage("Banner.jpg");
        maxX = 1200; maxY = ((MainWorld)getWorld()).getMap().getSz()[1]+4;
        base.scale(maxX, maxY);
        setImage(base);
    }
    
    public void act(){
        
    }
    
    public void refresh(){

//        SparkleEngine.drawLable(Color.WHITE, new Font("Courier New", Font.PLAIN, 20), 30, maxY/2 + 10, , GreenfootImage in)
    }
}
