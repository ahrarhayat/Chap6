public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper gameHelper = new GameHelper();
        SimpleDotCom TheDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        TheDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = gameHelper.getUserInput("enter a number:");
            String result = TheDotCom.Checkyourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }


    }

}

