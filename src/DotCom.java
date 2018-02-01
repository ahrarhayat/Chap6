
import java.util.ArrayList;

public class DotCom {
    String Name;
    private ArrayList<String> locationcells;

    public void setlocationcells(ArrayList<String> locs) {
        locationcells = locs;
    }

    public String checkyourself(String userInput) {
        String result = "miss";
        int index = locationcells.indexOf(userInput);
        //returns -1 when userInput does not exist in the ArrayList
        if (index >= 0) {
            locationcells.remove(index);
            if (locationcells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch!! "+"you just sank"+ " " + Name);
            } else {
                result = "hit";
            }

        }
        return result;

    }

    public void setName(String name) {
        Name = name;

    }
}



