package lecture_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample_2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Charlie", "Alice", "Bob");

        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
    }
}
