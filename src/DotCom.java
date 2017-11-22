import java.util.ArrayList;

public class DotCom {



        private ArrayList<String> locationcells;
        public void setLocationcells(ArrayList<String> locs)
        {
            locationcells = locs;

        }
        public String checkyourself(String userInput)
        {
            String result= "miss";
            int index = locationcells.indexOf(userInput);
            if(index>=0)
            {
                locationcells.remove(index);
                if(locationcells.isEmpty())
                {
                    result= "kill";
                }
                else {
                    result="hit";
                }

            }
            return result;

        }
    }


