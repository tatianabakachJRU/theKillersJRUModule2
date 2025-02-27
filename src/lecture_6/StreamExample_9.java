package lecture_6;

import java.util.stream.Stream;

public class StreamExample_9 {
    public static void main(String[] args) {
        Stream<String> apple = Stream.of("Apple", "Banana", "Cherry");
        apple.forEach(System.out::println);

        Stream<Double> generateStream = Stream.generate(Math::random).limit(5);
        generateStream.forEach(System.out::println);

        Stream<String> letters = Stream.of("A", "B", "C");
        Stream<String> letters2 = Stream.of("E", "D", "C");

        Stream<String> concatStream = Stream.concat(letters2, letters);
        concatStream.forEach(System.out::println);


    }
}
