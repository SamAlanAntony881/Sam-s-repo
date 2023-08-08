package StringPresent;

import StringPresent.StringCheckPresent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCheckPresentTest {
    StringCheckPresent stringCheckPresentTest = new StringCheckPresent();
    @Test
    void checkString() {

        assertEquals("success", stringCheckPresentTest.checkString("sam"));
        }@Test
    void checkString1() {

                assertEquals("sorry", stringCheckPresentTest.checkString("alan"));
    }@Test
    void checkString2(){
        assertEquals("success",stringCheckPresentTest.checkString("walter whiter"));
    }
    @Test
    void checkString3(){
        assertEquals("sorry",stringCheckPresentTest.checkString("methhead"));
    }


}