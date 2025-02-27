package lecture_6;

import java.util.Arrays;
import java.util.List;

public class StreamExample_10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Dave", "Alice", "Bob",
                "Alice", "Charlie", "Frank", "Anna");

        names.stream()

                .distinct()
                .filter(name -> name.startsWith("A"))
                .sorted()
                .peek(name -> System.out.println("After peek: " + name))
                .limit(3)
                .skip(1)

                .forEach(System.out::println);


    }
}
