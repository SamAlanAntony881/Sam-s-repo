import MailCheck.MailCheck;
import PrintEvenNum.PrintEvenNums;
import RemoveEventhPosition.RemoveEventhPosition;
import RemoveOddnumStrings.RemoveOddnumStrings;
import StringCheck.StringCheck;
import StringPresent.StringCheckPresent;
import StringVowelsCheck.StringListVowelsCheck;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner d = new Scanner(System.in);
        int f = d.nextInt();
        if(f == 1){
        StringCheck stringCheck = new StringCheck();
        stringCheck.setPassword("Gethxga");
        System.out.println(stringCheck.lengthCheck(stringCheck.getPassword()));
        System.out.println(stringCheck.checkAlphanum(stringCheck.getPassword()));}
if(f==2){
        MailCheck mailCheck = new MailCheck();
        mailCheck.setEmailId("smcv_18@gmail.com");
        mailCheck.checkValidId(mailCheck.getEmailId());
        mailCheck.checkSpecialChar(mailCheck.getEmailId());}
if(f==3) {
    RemoveEventhPosition removeEventhPosition = new RemoveEventhPosition();
    removeEventhPosition.setaLong(24682465264767836L);
    removeEventhPosition.checkRemoveNo(removeEventhPosition.getaLong());
}if(f==4) {
            RemoveOddnumStrings removeOddnumStrings = new RemoveOddnumStrings();
            List<String> str = new ArrayList<>();
            str.add("abc");
            str.add("tyu");
            str.add("yuio");
            str.add("poijuh");
            System.out.println(str);
            removeOddnumStrings.setStringList(str);
            removeOddnumStrings.removeOddnumStrings(str);
        }if(f==5) {
            StringListVowelsCheck stringListVowelsCheck = new StringListVowelsCheck();
            Map<String, String> mappedValues = new HashMap<>();
            mappedValues.put("a", "ganesh");
            mappedValues.put("b", "ajith");
            mappedValues.put("c", "sam");
            mappedValues.put("d", "HArInI");
            stringListVowelsCheck.setMappedValues(mappedValues);
            stringListVowelsCheck.stringVowelCheck(mappedValues);
        }if(f==6) {
            PrintEvenNums printEvenNums = new PrintEvenNums();
            List<Integer> integers = Arrays.asList(1, 2, 5, 2, 8, 4, 5);
            printEvenNums.setIntegerList(integers);
            printEvenNums.checkForEvenNum(printEvenNums.getIntegerList());
        }if(f==7) {
            Scanner s = new Scanner(System.in);
            String string = s.nextLine();
            StringCheckPresent stringCheckPresent = new StringCheckPresent();
            stringCheckPresent.checkString(string);
        }





    }
}