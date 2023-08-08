package StringVowelsCheck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringListVowelsCheck {
    Map<String,String> mappedValues;

    public Map<String, String> getMappedValues() {
        return mappedValues;
    }

    public void setMappedValues(Map<String, String> mappedValues) {
        this.mappedValues = mappedValues;
    }

    public List<String> stringVowelCheck(Map<String,String> mappedValues){
    String string = new String();

    List<String> str = new ArrayList<>();
    int j =0;
        for (Map.Entry<String,String> n:mappedValues.entrySet()
            ) {string = n.getValue();
        string = string.toLowerCase();
        String sam = new String();
        for(int i=0;i<string.length();i++){
            switch (string.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':sam = sam + string.charAt(i);break;
                default:break;}
        }
        str.add(sam);}

        return str;
}}
