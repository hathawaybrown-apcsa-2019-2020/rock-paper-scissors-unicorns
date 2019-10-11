
/**
 * Write a description of class RPSMatch here.
 *
 * @author Vedha Muvva, Carolyn Glasener, Suzy Schwabl
 * @version (2019-10-08)
 */
public class RPSMatch
{
    // instance variables - replace the example below with your own
    private int compWins;
    private int humanWins;
    private int ties;
    private int humanSign, compSign;
    private int result;
    
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;

    /**
     * Constructor for objects of class RPSMatch
     */
    public RPSMatch()
    {
        // initialise instance variables
        compWins = 0;
        humanWins = 0;
        ties = 0;
    }

    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getHumanPlay()
    {
        return humanSign;
    }
    
    public void setHumanPlay(int n)
    {
        humanSign = n;
    }
    
    public void setCompSign()
    {
        if(humanWins >= compWins)
        {
            if(humanSign == 1)
            {
                compSign = 2;
            }
            else if(humanSign == 2)
            {
                compSign = 3;
            }
            else
            {
                compSign = 1;
            }
        }
        else
        {
            compSign = (int) (Math.random() * 3 + 1);
        }
    }
    
    public int getCompSign()
    {
        return compSign;
    }
    
    public int getTies()
    {
        return ties;
    }
    
    public int getHumanWins()
    {
        return humanWins;
    }
    
    public int getComputerWins()
    {
        return compWins;
    }
    
    public int getResult()
    {
        setCompSign();
        if (compSign == humanSign)
        {
            result = 0;
            ties++;   
        }
        else if (humanSign % 3 - compSign % 3 == 1)
        {
            result = 1;
            humanWins++;
        }
        else 
        {
            result = -1;
            compWins++;
        }
        return result;
    }
    
    public String getComputerText()
    {
        if (compSign == 1)
        {
            return "Rock";
        }
        else if (compSign == 2)
        {
            return "Paper";
        }
        else
        {
            return "Scissors";
        }
    }
    
    public String youWon()
    {
        if (result == 0)
        {
            return "It's a tie!";
        }
        else if (result == 1)
        {
            return "You Won!";
        }
        else
        {
            return "Computer Wins!";
        }
    }
         
    //for the actual match, if difference is 1 greater or 2 lower, then win
    //if the same then 
}
