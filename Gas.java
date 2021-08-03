import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bacteria fload along in the bloodstream. They are bad. Best to destroy
 * them if you can.
 * https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/GasolineContainer.JPG/1200px-GasolineContainer.JPG

 * @author 
 * @version 
 */
public class Gas extends Actor
{
    /**
     * Constructor. Nothing to do so far.
     */
    public Gas()
    {
    }

    /**
     * Float along the bloodstream, slowly rotating.
     */
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
