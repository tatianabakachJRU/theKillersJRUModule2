package lecture_7;

public class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    void sleep(){
        System.out.println("Dog is sleeping");
    }
}
