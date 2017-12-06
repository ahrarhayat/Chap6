/*
import java.util.ArrayList;

public class DotCom {
  String Name;
  private ArrayList<String> locationcells;

    public void setLocationcells(ArrayList<String> locs)
        {
            locationcells = locs;

        }
        public String checkyourself(String userInput)
        {
            String result= "miss";
            int index = locationcells.indexOf(userInput);
            //returns -1 when userInput does not exist in the ArrayList
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

    public void setName(String name) {
        Name = name;
    }
}
*/


