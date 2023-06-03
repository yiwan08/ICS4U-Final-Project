import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Panel here.
 * 
 * @author Xuanxi Jiang
 * @version (a version number or a date)
 */
public class Panel extends Actor{
    /**
     * Act - do whatever the Panel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addedToWorld(World w){
        setImage(rect());
    }
    
    private GreenfootImage rect(){
        int x = 1200, y = ((MainWorld)getWorld()).getMap().getSz()[1]+4;
        GreenfootImage tmp = new GreenfootImage(x, y);
        tmp.setColor(Color.RED);
        tmp.fillRect(0, 0, x, y);
        return tmp;
    }
    
    public void act(){
        // Add your action code here.
    }
}
