package lecture_7;

public class CastingExample_3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;
        Object object = dog;

        dog.makeSound();
        dog.eat();
        dog.sleep();
        animal.makeSound();
        animal.eat();
        //animal.sleep();
        //object.makeSound();

    }
}
