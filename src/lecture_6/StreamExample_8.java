package lecture_6;

import java.util.Arrays;
import java.util.List;

public class StreamExample_8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Dave", "Alice", "Bob");

        List<String> list =
                names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .toList();

        System.out.println(list);

    }
}
