import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CheckTest {
    Check check = new Check();

    @Test
    void checkForEvenNum() {
        List<Integer> integers = Arrays.asList(3,6,4,32,78,8);
        List<Integer> actual = Arrays.asList(6,4,32,78,8);
        assertEquals(actual,check.checkForEvenNum(integers));

    }
    @Test
    void checkForEvenNum1(){
        List<Integer> integers = Arrays.asList(4,2,5,3,9,1,11);
        List<Integer> actual = Arrays.asList(4,2,5);
        assertEquals(actual,check.checkForEvenNum(integers));
    }

    @Test
    void checkValidId() {
        String mailId = "samalan@gmail.com";
        assertEquals(true,check.checkValidId(mailId) );

    }

    @Test
    void checkSpecialChar() throws Exception {
        String mailId = "samalaaan&!^@gmail.com";
        assertEquals(new Exception("Not Valid"),check.checkSpecialChar(mailId));
    }
    @Test
    void checkValidId1(){
        String mailId = "WALTER_@gmail.com";
        assertEquals(true, check.checkValidId(mailId));
    }

    @Test
    public void checkSpecialChar1() throws Exception {
        String mailId = "ganes_**@gmail.com";
        assertEquals(new Exception("Not Valid"),check.checkSpecialChar(mailId));
    }

    @Test
    void checkRemoveNo()
        {
            Long along = 254123262781L;
            String string = "242228";
            assertEquals(string,check.checkRemoveNo(along));
        }
        @Test
        void checkRemoveNo1()
        {
            Long along = 45365435678L;
            String string = "435368";
            assertEquals(string,check.checkRemoveNo(along));
        }


    @Test
        void removeOddnumStrings() {
            List<String> string = new ArrayList<>();
            List<String> test = new ArrayList<>();
            string.add("ganesh");
            string.add("ajith");
            string.add("samalanantony");
            test.add("ajith");
            assertEquals(test,check.removeOddnumStrings(string));
        }
        @Test
        void removeOddnumStrings1()
        {
            List<String> string = new ArrayList<>();
            List<String> test = new ArrayList<>();
            string.add("iron man");
            string.add("captain america");
            string.add("deadpool");
            string.add("thanos");
            string.add("thor");
            string.add("hawkeye");
            test.add("captain america");
            test.add("thanos");
            assertEquals(test,check.removeOddnumStrings(string));
        }

    @Test
    void lengthCheck() {
        String password = "sgdhfryfghdvcgdhsafvk";
        assertEquals(false,check.lengthCheck(password));
    }
    @Test
    void checkAlphanum() {
        String password = "Sam@@@@08082001";
        boolean t = check.checkAlphanum(password);
        assertTrue(t);
    }
    @Test
    void lengthCheck1(){
        String password = "samhjks";
        assertEquals(true,check.lengthCheck(password));
    }
    @Test
    void checkAlphanum1(){
        String password = "samlanooosijbv";
        boolean t = check.checkAlphanum(password);
        assertFalse(t);
    }

    @Test
    void checkString() {
        assertEquals("success",check.checkString("sam"));

    }
    @Test
    void checkString1(){
        assertEquals("sorry", check.checkString("alan"));
    }
    @Test
    void stringVowelCheck() {
        Map<String,String> map = new HashMap<>();
        map.put("a","jai");
        map.put("b","mohan");
        map.put("c","sam");
        List<String> str = new ArrayList<>();
        str.add("ai");str.add("oa");str.add("a");
        assertEquals(str,check.stringVowelCheck(map));
    }
    @Test
    void stringVowelCheck1(){
        Map<String,String> map = new HashMap<>();
        map.put("a","manoharan");
        map.put("b","Glady Roseline");
        map.put("c","Sanchea Immaculate");
        map.put("d","Donita Tiara");
        map.put("e","Shavin Ignatius");
        List<String> str = new ArrayList<>();
        str.add("aoaa");str.add("aoe");str.add("aeaae");str.add("iaiaa");str.add("aiiaiu");
        assertEquals(str,check.stringVowelCheck(map));

    }
    }
