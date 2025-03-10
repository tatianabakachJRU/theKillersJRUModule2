package lecture_9.mutableObj;

public class MutableExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sb.toString());

        // Изменяем состояние объекта
        sb.append(", World!");
        System.out.println("Updated StringBuilder: " + sb.toString());
    }
}