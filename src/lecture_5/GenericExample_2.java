package lecture_5;

import lecture_2.abstraction.Cat;

public class GenericExample_2 {
    public static void main(String[] args) {
        String hello = combine(10, "Hello");
        System.out.println(hello);
        String marsik = combine(true, new Cat("Marsik"));
        System.out.println(marsik);
    }

    public static <T, E> String combine(T first, E second){
        T item;
        return "First: " + first.toString() + " Second: " + second.toString();
    }
}
