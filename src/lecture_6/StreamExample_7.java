package lecture_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample_7 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        Stream<String> stream = names.stream();

        String[] cats = {"Boris", "Rex", "Locy"};
        Stream<String> stream1 = Arrays.stream(cats);

    }
}
