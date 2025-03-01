package lecture_7;

public class CastingExample_4 {
    public static void main(String[] args) {
        Animal animal = new Dog();

        if(animal instanceof Cat) {
            Cat cat = (Cat) animal;
        } else {
            System.out.println("This animal is not a cat");
        }

        Dog dog = (Dog) animal;
    }
}
