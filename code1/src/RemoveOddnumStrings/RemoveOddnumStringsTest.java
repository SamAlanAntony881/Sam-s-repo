package RemoveOddnumStrings;

import RemoveOddnumStrings.RemoveOddnumStrings;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveOddnumStringsTest {
    RemoveOddnumStrings removeOddnumStrings = new RemoveOddnumStrings();
    @Test
    void removeOddnumStrings() {
        List<String> string = new ArrayList<>();
        List<String> test = new ArrayList<>();
        string.add("ganesh");
        string.add("ajith");
        string.add("samalanantony");
        test.add("ajith");
        assertEquals(test,removeOddnumStrings.removeOddnumStrings(string));
    }
    @Test
    void removeOddnumStrings1(){
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
        assertEquals(test,removeOddnumStrings.removeOddnumStrings(string));
    }
}