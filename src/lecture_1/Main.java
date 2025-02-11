package lecture_1;

import lecture_1.abstraction.Cat;
import lecture_1.abstraction.Dragon;
import lecture_1.abstraction.Pet;
import lecture_1.interfaces.Flyable;
import lecture_1.interfaces.GreenDragon;
import lecture_1.interfaces.RedDragon;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Pet whiskers = new Cat("Whiskers");
        Pet draco = new Dragon("Draco");
        Flyable redDragon = new RedDragon("Red Dragon");
        GreenDragon greenDragon = new GreenDragon("Green Dragon");

        whiskers.printName();
        whiskers.makeSound();

        draco.printName();
        draco.makeSound();

        redDragon.fly();
        greenDragon.fly();



    }
}
