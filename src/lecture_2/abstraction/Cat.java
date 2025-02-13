package lecture_2.abstraction;

public class Cat extends Pet implements Trainable{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void play() {
        System.out.println("Cat plays");
    }

    @Override
    Cat getPet() {
        Cat cat = new Cat("Roblox");
        return cat;
    }

    @Override
    public void train() {
        System.out.println("Cat trains");
    }

    @Override
    public void printName() {
        super.printName();
    }
}
