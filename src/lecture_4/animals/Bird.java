package lecture_4.animals;

public class Bird implements Animal, Flying{

    @Override
    public void makeSound() {
        System.out.println("Fiu-fiu");
    }

    @Override
    public void fly() {
        System.out.println("Flies bird");
    }
}
