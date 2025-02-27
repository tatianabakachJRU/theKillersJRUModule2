package lecture_6;

import java.util.function.Function;

public class MethodReferenceExample_5 {
    public static void main(String[] args) {
        Function<String, Cat> aNew = Cat::new;
        Cat boris = aNew.apply("Boris");
        System.out.println(boris.getName());
    }
}
