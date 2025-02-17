package lecture_4.unicorns;

import java.io.Serializable;

public class SparkleUnicorn implements Unicorn, Serializable {

    private int speed;
    private final String color;

    public SparkleUnicorn() {
        this.speed = 0;
        this.color = DEFAULT_COLOR;
    }

    @Override
    public void gallop() {
        if (speed < MAX_SPEED) {
            speed += 20;
            System.out.println("Sparkle Unicorn speed: " + speed);
        } else {
            System.out.println("Sparkle Unicorn has maximum speed!!!");
        }
    }

    @Override
    public void eat(String food) {
        if (food.equals(FAVORITE_FOOD)){
            System.out.println("Sparkle Unicorn is happy");
        } else {
            System.out.println("Sparkle Unicorn is sad");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a magical Sparkle Unicorn with color " + color);
    }
}
