import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShaderBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShaderBox extends Actor{
    GreenfootImage blk, realImg;
    
    public ShaderBox(int xsz, int ysz){
        blk = new GreenfootImage(xsz, ysz);
        blk.setColor(Color.BLACK);
        blk.fillRect(0, 0, xsz, ysz);
        realImg = new GreenfootImage(blk);
        this.setImage(blk);
        iluminate();
    }
    
    public void act(){
        
    }
    
    public void iluminate(){
        realImg = new GreenfootImage(SparkleEngine.setTransparency(blk, 70));
        this.setImage(realImg);
    }
}
