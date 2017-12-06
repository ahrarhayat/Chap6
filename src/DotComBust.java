/*
import java.util.ArrayList;

public class DotComBust {
    //Declare and instantiate the variables

   private int numOfGuesses=0;
   private ArrayList<DotCom> dotComslist = new ArrayList<DotCom>();
    // Private GameHelperPlus helper;

    public void setUpGame()
    {
        //make three dotcoms, give them names and put them in an array list

     DotCom one = new DotCom();
     DotCom two = new DotCom();
     DotCom three = new DotCom();
     one.setName("Pets.com");
     two.setName("eToys.com");
     three.setName("Go2.com");
       dotComslist.add(one);
       dotComslist.add(two);
       dotComslist.add(three);

       //Give brief instructions to the user

      System.out.println("Your goal is to sink the three Dotcoms");
      System.out.println("Pets.com, eToys.com, Go2.com ");
      System.out.println("Try to sink them with the least amount of guesses");

      //Repeat with each dotcoms in the list

      //for(DotCom dotComToSet : dotComsList)

        //Ask the helper for a new location

        // {Array<String> newLocation=helper.placedotcom(3);

        //Call a setter method on the Dotcom object with the new locations

        // dotComToSet.setLocationcells(newLocation)
        // }


    }

    public void StartPlaying(){
        //as long as dotcom is not empty

        while (!dotComslist.isEmpty())
        {
           // String userGuess = helper.getUserInput("Enter a guess");
            //    checkUserGuess(userGuess);

        }
        //call our own finishGame() method

        finishGame();
    }
    public void CheckUserGuess(String UderGuess)
    { //call our own CheckUserGuess method
        numOfGuesses++;
        String result = "miss" ;
        for (DotCom dotComToTest : dotComslist) {
          //  result = dotComToTest.checkyourself();
            if (result.equals("hit")){
                break;
            }
            System.out.println(result);
        }

    }
    public void finishGame()
    {

        System.out.println("All Dot Corns are dead! Your stock i s now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you" + numOfGuesses + " guesses.");
            System.out.println(" You got out before your optio n s sank.");
        }
        else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesse s .");
            System.out.println("Fish are dancing with your option s . " ) ;
        }
    }
    public static void main(String args [])
    {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.StartPlaying();
    }
}
*/
