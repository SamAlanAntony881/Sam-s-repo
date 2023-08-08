package PrintEvenNum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintEvenNums {
    List<Integer> integerList;

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }
    public List<Integer> checkForEvenNum(List<Integer> integerList){
         List<Integer> sample = integerList.stream().distinct().filter(n->n%2==0).collect(Collectors.toList());
        sample.forEach(n-> System.out.println(n));
        return sample;



}}