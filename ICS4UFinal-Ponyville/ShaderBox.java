import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShaderBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShaderBox extends Actor{
    GreenfootImage blk;
    
    public ShaderBox(int xsz, int ysz){
        blk = new GreenfootImage(xsz, ysz);
        blk.setColor(Color.BLACK);
        blk.fillRect(0, 0, xsz, ysz);
        this.setImage(blk);
    }
    
    public void act(){
        
    }
}
