package MailCheck;

import MailCheck.MailCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailCheckTest {
    MailCheck mailCheck = new MailCheck();
    @Test
    void checkValidId() {
        String mailId = "samalan@gmail.com";
        assertEquals(true,mailCheck.checkValidId(mailId) );

    }

    @Test
    void checkSpecialChar() throws Exception {
       String mailId = "samalaaan&!^@gmail.com";
       assertEquals(new Exception("Not Valid"),mailCheck.checkSpecialChar(mailId));
    }
    @Test
    void checkValidId1(){
        String mailId = "WALTER_@gmail.com";
        assertEquals(true, mailCheck.checkValidId(mailId));
    }

    @Test
    public void checkSpecialChar1() throws Exception {
        String mailId = "ganes_**@gmail.com";
        assertEquals(new Exception("Not Valid"),mailCheck.checkSpecialChar(mailId));
    }
}
