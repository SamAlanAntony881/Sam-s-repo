package RemoveOddnumStrings;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddnumStrings {
    List<String> stringList ;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
    public List<String> removeOddnumStrings(List<String> stringList) {
        List<String> updatedEvenString = new ArrayList<>();
        List<String> updatedOddString = new ArrayList<>();
        String string = new String();
        int size = stringList.size();
        for (int i = 0; i < size; i++)
        {
            {if(i%2==0)
                updatedEvenString.add (stringList.get(i));
            else {
                updatedOddString.add(stringList.get(i));
            }
            }
        }
        stringList.clear();
        System.out.println("List 1 ---->  " + updatedEvenString);
        System.out.println("List 2 ---->  " + updatedOddString);
        return updatedOddString;

    }

}
