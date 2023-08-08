package RemoveEventhPosition;

import RemoveEventhPosition.RemoveEventhPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveEventhPositionTest {
    RemoveEventhPosition removeEventhPosition = new RemoveEventhPosition();
    @Test
    void checkRemoveNo()
    {
        Long along = 254123262781L;
        String string = "242228";
        assertEquals(string,removeEventhPosition.checkRemoveNo(along));
    }
    @Test
    void checkRemoveNo1()
    {
        Long along = 45365435678L;
        String string = "435368";
        assertEquals(string,removeEventhPosition.checkRemoveNo(along));
    }
}