import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Virus here.
 * https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Caltrop.jpg/220px-Caltrop.jpg

 * @author 
 * @version (a version number or a date)
 */
public class Spike extends Actor
{
    /**
     * Act - do whatever the Virus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-4, getY());
        turn(1);
        checkCollision();
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }

    }    
    private void checkCollision()
    
    {
        
        if (isTouching(Car.class))
        { 
            
            Greenfoot.playSound("ouch.wav");
            removeTouching(Car.class);

            Greenfoot.stop();

        }
    }
}
