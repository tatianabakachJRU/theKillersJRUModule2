package lecture_7.animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
