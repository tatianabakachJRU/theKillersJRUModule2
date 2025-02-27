package lecture_6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExample_3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

//        Consumer<String> consumer
//                = name -> System.out.println(name);

        names.forEach(System.out::println);
    }
}
