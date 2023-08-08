package StringPresent;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class StringCheckPresent {
    public String checkString(String string){
        int a =0;
        final List<String> stringList = Arrays.asList("sam","methhead","breaking bad","walter white");
        boolean b = stringList.stream().anyMatch(n->n.equals(string));
        if (b == true) {
            return "success";
        } else return "sorry";}
}
