package lecture_1.abstraction;

import lecture_1.interfaces.FireBreathable;

public class Cat extends Pet implements FireBreathable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " say: Meow!!!");
    }

    @Override
    public void breathFire() {

    }
}
