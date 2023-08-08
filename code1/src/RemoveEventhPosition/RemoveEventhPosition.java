package RemoveEventhPosition;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEventhPosition {
    Long aLong ;

    public Long getaLong() {
        return aLong;
    }
    public void setaLong(Long aLong) {
        this.aLong = aLong;
    }
    public String checkRemoveNo(Long aLong) {
        String str = String.valueOf(aLong);
        System.out.println(str);
        char[] checkNum = str.toCharArray();
        char[] finalNum = new char[10];
        int j = 0;
        for (int i = 0; i < checkNum.length; i++) {
            if (i % 2 == 0) {
                finalNum[j] = checkNum[i];
                j++;
            }
        }String string = String.valueOf(finalNum);
         String string1 =   string.replaceAll("\0","");
        System.out.println(string1);
            return string1;
    }
}

