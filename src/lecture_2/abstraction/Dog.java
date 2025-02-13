package lecture_2.abstraction;

import java.io.Serializable;

public class Dog extends Pet implements Trainable {

    public Dog(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println("Dog plays");
    }

    @Override
    Pet getPet() {
        return null;
    }

    @Override
    protected void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void train() {
        System.out.println("Dog trains");
    }
}
