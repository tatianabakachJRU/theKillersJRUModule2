package lecture_4.unicorns;

public interface Unicorn {

    String DEFAULT_COLOR = "White";

    int MAX_SPEED = 100;

    String FAVORITE_FOOD = "Magical Herbs";


    void gallop();

    void eat(String food);

    default void displayInfo() {
        String str = "Hello!!!";
        System.out.println("This is a magical unicorn!" + str);
    }

    static void sayHello() {
        System.out.println("Hello from Unicorn World!!!");
    }

    static void listCharacteristics() {
        System.out.println("Unicorn Characteristics:");
        System.out.println("Default color: " + DEFAULT_COLOR);
        System.out.println("Max speed: " + MAX_SPEED);
        System.out.println("Favorite food: " + FAVORITE_FOOD);
    }
}
