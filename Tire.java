import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCell here.
 * https://upload.wikimedia.org/wikipedia/commons/f/f2/Front_tire_and_18_inch_wheel_of_2004-2007_NISSAN_FUGA.jpg

 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tire extends Actor
{
    /**
     * Act - do whatever the RedCell wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tire()
    {
    }

    public void act() 
    {
        setLocation(getX()-2, getY());
        turn(1);
        if (getX() == 0) 
        {
            Road bloodstream = (Road) getWorld();

            bloodstream.removeObject(this);
        }
    }    
}
