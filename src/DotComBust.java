
import java.util.ArrayList;

public class DotComBust {
    //Declare and instantiate the variables


    private int numOfGuesses = 0;
    private ArrayList<DotCom> dotComslist = new ArrayList<DotCom>();
    //To hold DotCom instances
    private GameHelperPlus helper = new GameHelperPlus();


    public void setUpGame() {


        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComslist.add(one);
        dotComslist.add(two);
        dotComslist.add(three);
        //make three dotcoms, give them names and put them in an array list


        System.out.println("Your goal is to sink the three Dotcoms");
        System.out.println("Pets.com, eToys.com, Go2.com ");
        System.out.println("Try to sink them with the least amount of guesses");
        //Give brief instructions to the user



        for (DotCom dotComToSet : dotComslist) {


            ArrayList<String> newLocation = helper.placeDotCom(3);
            //Ask the helper for a new location
            dotComToSet.setlocationcells(newLocation);
            //Call a setter method on the Dotcom object with the new locations


        }
    }

    public void StartPlaying() {
        //as long as dotcom is not empty

        while (!dotComslist.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            CheckUserGuess(userGuess);
            //call our own check userGuess method

        }
        //call our own finishGame() method

        finishGame();
    }

    public void CheckUserGuess(String userGuess) {
        //call our own CheckUserGuess method
        numOfGuesses++;
        String result = "miss";
        for (DotCom dotComToTest : dotComslist) {
            result = dotComToTest.checkyourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                System.out.println(result);
                dotComslist.remove(dotComToTest);
            }
        }
        System.out.println(result);
    }

    public void finishGame() {

        System.out.println("All Dot Corns are dead! Your stock i s now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you" + numOfGuesses + " guesses.");
            System.out.println(" You got out before your optio n s sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesse s .");
            System.out.println("Fish are dancing with your option s . ");
        }
    }

    public static void main(String args[]) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.StartPlaying();
    }

}

