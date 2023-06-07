import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ProgressBar here.
 * 
 * @author Yawen
 * @version 20230606
 */
public class ProgressBar extends Actor
{
    GreenfootImage HPBar, MPBar;
    GreenfootImage img;
    int selection, barValue;
    //private static Color BLUE = new Color (255, 216, 0);
    //private static Color RED = new Color (200, 150, 2);
    
    /**
     * Act - do whatever the ProgressBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        implementBar();
    }
    
    public ProgressBar(int select) {
        img = new GreenfootImage(50, 20);
        img.drawRect(0, 0, 50, 19);
        setImage(img);
        selection = select;
    }
    // x, y, width, height
    public void implementBar(){
        if (selection == 0) {
            barValue = Statics.getHP();
        }
        if (selection == 1) {
            barValue = Statics.getMP();
        }
        img.setColor(Color.BLUE);
        img.fillRect(0, 0, barValue, 20);
        img.setColor(Color.RED);
        img.fillRect(barValue, 0, 50, 20);
    }
}
