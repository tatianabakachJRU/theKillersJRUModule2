package lecture_7;

public class Cat extends Animal implements Eating{
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
