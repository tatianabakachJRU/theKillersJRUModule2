package lecture_9.mutableObj;

public class ImmutableExample {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);

        // Создание новой строки
        str.concat(" World!"); // надо положить в новую переменную
        System.out.println("Updated String: " + str);
    }
}