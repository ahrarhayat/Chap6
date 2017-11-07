public class SimpleDotCom {
    int [] LocationCells;
    int NumOfHits;
    int n;
    public String Checkyourself(String UserGuess )
    {
        int guess = Integer.parseInt(UserGuess);
        String result = "miss";
        for(int cell:LocationCells)
        {
            if(guess==cell)
            {
                result = "hit";
                NumOfHits++ ;
                LocationCells[n] = -1;
                n++;

                break;
            }
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

