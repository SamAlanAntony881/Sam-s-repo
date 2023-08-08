package StringVowelsCheck;

import StringVowelsCheck.StringListVowelsCheck;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringListVowelsCheckTest {

    StringListVowelsCheck stringListVowelsCheckTest = new StringListVowelsCheck();
    @Test
    void stringVowelCheck() {
        Map<String,String> map = new HashMap<>();
        map.put("a","jai");
        map.put("b","mohan");
        map.put("c","sam");
        List<String> str = new ArrayList<>();
        str.add("ai");str.add("a");str.add("a");
    assertEquals(str,stringListVowelsCheckTest.stringVowelCheck(map));
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
        str.add("aoaa");str.add("aoeie");str.add("aeaiauae");str.add("oiaiaa");str.add("aiiaiu");
        assertEquals(str,stringListVowelsCheckTest.stringVowelCheck(map));

    }
    @Test
    void stringVowelCheck2(){
        Map<String,String> map = new HashMap<>();
        map.put("a","Bruno");
        map.put("b","Praveen");
        map.put("c","Sona");
        map.put("d","Tina");
        List<String> str = new ArrayList<>();
        str.add("uo");str.add("aee");str.add("oa");str.add("ia");
        assertEquals(str,stringListVowelsCheckTest.stringVowelCheck(map));

    }
    @Test
    void stringVowelCheck3(){
        Map<String,String> map = new HashMap<>();
        map.put("a","roshan");
        map.put("b","rohit");
        map.put("c","shree vishnu");
        List<String> str = new ArrayList<>();
        str.add("oa");str.add("oi");str.add("eeu");
        assertEquals(str,stringListVowelsCheckTest.stringVowelCheck(map));

    }
}