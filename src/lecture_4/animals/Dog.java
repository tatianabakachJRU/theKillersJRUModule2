package lecture_4.animals;

public class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
}
