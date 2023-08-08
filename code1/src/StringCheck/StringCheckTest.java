package StringCheck;

import StringCheck.StringCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCheckTest {
    StringCheck stringCheck = new StringCheck();
    @Test
    void lengthCheck() {
        String password = "sgdhfryfghdvcgdhsafvk";
        assertEquals(false,stringCheck.lengthCheck(password));
    }

    @Test
    void checkAlphanum() {
        String password = "Sam@@@@08082001";
        boolean t = stringCheck.checkAlphanum(password);
        assertTrue(t);
    }
}