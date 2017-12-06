public class SimpleDotCom {
    int [] LocationCells;
    int NumOfHits;

    public String Checkyourself(String UserGuess )
    {

        int guess = Integer.parseInt(UserGuess);
        int n=0;
        String result = "miss";
        for(int cell:LocationCells)
        {
            if(guess==cell)
            {
                result = "hit";
                NumOfHits++;
                LocationCells[n] = -1;

                break;

                 }
            n++;

        }

        if(NumOfHits==LocationCells.length)
        {
            result ="kill";

        }
        System.out.println(result);
        return result;

    }
    public void  setLocationCells(int [] loc)
    {
        LocationCells = loc;
    }

}

