package lecture_1.interfaces;

import lecture_1.abstraction.Dragon;

public class RedDragon extends Dragon implements Flyable {
    public RedDragon(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("This dragon is flying high in the sky!");
    }
}
