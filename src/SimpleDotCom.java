public class SimpleDotCom {
    int [] LocationCells;
    int NumOfHits;
    int n=0;
    int rand;
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
                LocationCells[n] = -1*( rand =  (int) (Math.random()*5));
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

