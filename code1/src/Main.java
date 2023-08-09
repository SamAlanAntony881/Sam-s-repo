
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Check check = new Check();
        Input input = new Input();

//1
        check.checkForEvenNum(input.sam);
        System.out.println("check for evenNum is completed");
//2
        check.checkRemoveNo(236732434L);
        System.out.println("removal of even position nums in long type nums");
//3
        check.checkValidId("smcv18@gmail.com");
        check.checkSpecialChar("smcv*@gmail.com");
        System.out.println("Mailcheck completed");
//4
        check.removeOddnumStrings(input.modelString);
        System.out.println("odd strings completed");
//5
        check.lengthCheck("Getcxhfg");
        check.checkAlphanum("Getcxhfg");
        System.out.println("Password check completed");
//6
        check.checkString("methhead");
        System.out.println("string present completed");
//7
        check.stringVowelCheck(input.mappedValues);
        System.out.println("string vowel check completed");
    }
}