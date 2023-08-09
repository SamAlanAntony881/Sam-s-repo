import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Check extends Exception {
        public List<Integer> checkForEvenNum(List<Integer> integerList){
            List<Integer> sample = integerList.stream().distinct().filter(n->n%2==0).collect(Collectors.toList());
            sample.forEach(n-> System.out.println(n));
            return sample;}

            public boolean checkValidId(String emailId){
                String modelEmailId = "gmail.com";
                String[] subWord;
                subWord = emailId.split("@");
                boolean check = subWord[1].equals(modelEmailId);
                return check;
}
            public Exception checkSpecialChar(String emailId) throws Exception {
        int a = 0;
        String[] subWord;
        subWord = emailId.split("@");
        for(int i=0;i<subWord[0].length();i++){
            if((!Character.isDigit(subWord[0].charAt(i)))
                    &&(!Character.isLetter(subWord[0].charAt(i)))){
                if ((int) subWord[0].charAt(i) != 95) {
                    a = 1;
                    return new Exception("Not Valid") ;}
            }

        }
        if ( a==0 )
            System.out.println( "valid");

        return null;
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
            public List<String> removeOddnumStrings(List<String> stringList) {
                List<String> updatedEvenString = new ArrayList<>();
                List<String> updatedOddString = new ArrayList<>();
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
                return updatedOddString;}

            public boolean lengthCheck(String password){
                if((password.length()>=8)&&(password.length()<=15))
                {
                    return true;
                }
                else
                    return false;}
            public boolean checkAlphanum(String password){
                int a = 0;
                for (int i = 0; i < password.length(); i++) {
                    if ((!Character.isDigit(password.charAt(i))) && (!Character.isWhitespace(password.charAt(i)))
                            && (!Character.isLetter(password.charAt(i)))) {
                        a++;
                    }
                }
                if (a > 1)
                    return true;
                else
                    return false;
            } public String checkString(String string){
        int a =0;
        final List<String> stringList = Arrays.asList("sam","methhead","breaking bad","walter white");
        boolean b = stringList.stream().anyMatch(n->n.equals(string));
        if (b == true) {
            return "success";
        } else return "sorry";}
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

