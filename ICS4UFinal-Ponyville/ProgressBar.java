import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ProgressBar here.
 * 
 * @author Yawen
 * @version 20230606
 */
public class ProgressBar extends Actor{
    GreenfootImage HPBar, MPBar;
    GreenfootImage img;
    int selection, barValue;
    private static Color beforeHP = new Color (255, 216, 0);
    private static Color afterHP = new Color (200, 150, 2);
    
    /**
     * Act - do whatever the ProgressBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        //implementBar();
        if(selection==0)
            setImage(SparkleEngine.drawProgressBar(50, Statics.getHP(), 160, 20, beforeHP, afterHP));
        else if(selection==1)
            setImage(SparkleEngine.drawProgressBar(100, Statics.getMP(), 160, 20, Color.BLUE, Color.RED));
    }
    
    public ProgressBar(int select){
        selection = select;
        if(selection==0)
            setImage(SparkleEngine.drawProgressBar(50, Statics.getHP(), 160, 20, beforeHP, afterHP));
        else if(selection==1)
            setImage(SparkleEngine.drawProgressBar(100, Statics.getMP(), 160, 20, Color.BLACK, Color.BLUE));
    }
}
