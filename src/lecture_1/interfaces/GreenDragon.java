package lecture_1.interfaces;

import lecture_1.abstraction.Cat;
import lecture_1.abstraction.Dragon;

import java.io.Serializable;

public class GreenDragon
        extends Dragon
        implements Flyable, Serializable, FireBreathable {

    public GreenDragon(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("This dragon is flying low to the ground!");
    }

    @Override
    public void breathFire() {
        System.out.println("This dragon breathes fire!!!");
    }
}
