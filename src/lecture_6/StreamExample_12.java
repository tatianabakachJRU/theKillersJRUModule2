package lecture_6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample_12 {
    public static void main(String[] args) {
        List<Dragon> dragons = Arrays.asList(
                new Dragon("Alice", 300),
                new Dragon("Bob", 500),
                new Dragon("Charlie", 50));

        Optional<String> first = dragons.stream()
                .filter(dragon -> dragon.age >= 300)
                .map(Dragon::getName)
                .findFirst();

        System.out.println(first);
    }
}
