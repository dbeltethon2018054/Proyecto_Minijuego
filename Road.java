import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bloodstream is the setting for our White Blood Cell scenario. 
 * It's a place where blood cells, bacteria and viruses float around.
 * https://www.google.com/search?biw=1920&bih=964&tbm=isch&sa=1&ei=tlsUWtb6I8r4_Abww7yQBA&q=road++background+wikimedia&oq=road++background+wikimedia&gs_l=psy-ab.3...2592.5279.0.5554.0.0.0.0.0.0.0.0..0.0....0...1c.1.64.psy-ab..0.0.0....0.6cAuIW_isUU#imgrc=T1jB4h7JzWNcEM:


 * @author 
 * @version 
 */
public class Road extends World
{
    private int score;
    public int time;
    /**
     * Constructor: Set up the staring objects.
     */
    public Road()
    {    
        super(1683, 840, 1); 

        prepare();
        score = 0;
        time = 2000;
        showScore();
        showTime();
        showEndMessage();


    }

    public void addScore(int value) 
    {
        score = score + value;
        showText("Score: " + score, 150, 75);
    }

    private void showScore()
    {
        showText("Score: " + score, 150, 75);
    }

    public void act()
    {

        if (Greenfoot.getRandomNumber(100) < .5)
        {
            addObject(new Spike(), 1680, Greenfoot.getRandomNumber(700));

        }
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Tire(), 1680, Greenfoot.getRandomNumber(700));
        }   
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Gas(), 1680, Greenfoot.getRandomNumber(700));

        }
        countTime();
        showTime();
        showEndMessage();
      
        

    }

    /**
     * Prepare the world for the start of the program. In this case: Create
     * a white blood cell and the lining at the edge of the blood stream.
     */
    private void prepare()
    {
        Car whitecell = new Car();
        addObject(whitecell, 300, 500);

    }

    private void countTime()
    {
        time--;
        showTime();
        if (time == 0)
        {
            showEndMessage();
            Greenfoot.stop();
        }

    }      

    private void showTime()
    {
        showText("Time:" + time, 1550, 75);
    }

    private void showEndMessage()
    {   
        if (time == 0)
        {

            showText("Time is up you win!", 840, 450);
            showText("Your final score " + score + " points", 840, 400);
        }
        
        if (score < 0)

        {
            showText("GAME OVER", 840, 450);
            Greenfoot.stop();
        }
        
        

    }

    private void endGame()
    {
        if (score < 0)

        {
            showText("GAME OVE", 840, 450);
            Greenfoot.stop();
        }

    }
    
}  
