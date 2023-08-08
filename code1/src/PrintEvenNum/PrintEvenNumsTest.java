package PrintEvenNum;

import PrintEvenNum.PrintEvenNums;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrintEvenNumsTest {
    PrintEvenNums printEvenNums = new PrintEvenNums();
    @Test
    void checkForEvenNum() {
        List<Integer> integers = Arrays.asList(3,6,4,32,78,8);
        List<Integer> actual = Arrays.asList(6,4,32,78,8);
        assertEquals(actual,printEvenNums.checkForEvenNum(integers));

    }
    @Test
    void checkForEvenNum1(){
        List<Integer> integers = Arrays.asList(4,2,5,3,9,1,11);
        List<Integer> actual = Arrays.asList(4,2,5);
        assertEquals(actual,printEvenNums.checkForEvenNum(integers));
    }
    @Test
    void checkForEvenNum2(){
        List<Integer> integers = Arrays.asList(5,7,3,1,9,3,99);
        List<Integer> actual = new ArrayList<>();
        assertEquals(actual,printEvenNums.checkForEvenNum(integers));
    }
}