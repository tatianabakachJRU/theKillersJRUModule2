package lecture_6;

import java.util.Arrays;
import java.util.List;

public class StreamExample_11 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Dave", "Alice", "Bob");

        List<Integer> list = names.stream()
                .map(String::length)
                .toList();
        System.out.println(list);
    }
}
