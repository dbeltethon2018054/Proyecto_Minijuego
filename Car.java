import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a white blood cell. This kind of cell has the job to catch 
 * bacteria and remove them from the blood.
 * https://upload.wikimedia.org/wikipedia/commons/7/73/Classic_Formula_Ford_Competition_race-car_pic8.JPG

 * @author 
 * @version 
 */
public class Car extends Actor
{

    /** 
     * Check whether we are touching a bacterium or virus. Remove 
     * bacteria. Game over if we hit a virus.
     */
    private void checkCollision()
    {
        if (isTouching(Gas.class))
        { 
            Greenfoot.playSound("powerup.wav");
            removeTouching(Gas.class);

            Road road =(Road) getWorld();
            road.addScore(20);
        }
        if (isTouching(Spike.class))
        {
            Greenfoot.playSound("ouch.wav");
            Road road =(Road) getWorld();
            removeTouching(Spike.class);
            road.addScore(-50);

        }
        if (isTouching(Tire.class))
        {
            Greenfoot.playSound("powerup.wav");
            removeTouching(Tire.class);

            Road road =(Road) getWorld();
            road.addScore(20);

        }
    }

    /**
     * Act: move up and down when cursor keys are pressed.
     */
    public void act() 
    {
        checkKeyPress();
        checkCollision();

    }

    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-6);
        }

        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+6);
        }
        if (Greenfoot.isKeyDown("left") )
        {
            move(-5);

        }
        if (Greenfoot.isKeyDown("right") )
        {
            move (5);

        }
    }   

}
