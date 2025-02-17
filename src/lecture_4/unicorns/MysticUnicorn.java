package lecture_4.unicorns;

public class MysticUnicorn extends MagicalCreature implements Unicorn{

    private int speed;
    private final String color;


    public MysticUnicorn(String name) {
        super(name);
        this.speed = 0;
        this.color = "Blue";
    }


    @Override
    public void gallop() {
        if (speed < MAX_SPEED) {
            speed += 25;
            System.out.println("Mystic Unicorn speed: " + speed);
        } else {
            System.out.println("Mystic Unicorn has maximum speed!!!");
        }
    }

    @Override
    public void eat(String food) {
        if (food.equals(FAVORITE_FOOD)){
            System.out.println(color + "mystic unicorn enjoys the food " + food);
        } else {
            System.out.println(color + "mystic unicorn turn away from the food " + food);
        }
    }
}
