package lecture_9.mutableObj;

import java.util.ArrayList;

public class MutableExample_1 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(); // ArrayList strings
        strings.add("Hello"); // ArrayList strings
        strings.set(0, "Hi"); // ArrayList strings

        String str = "Hello"; // "Hello"
        String concat = str.concat(" World"); //"Hello World"
    }
}
