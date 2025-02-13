package lecture_2.abstraction;

public abstract class Pet extends Animal {

    public Pet(String name) {
        super(name);
    }

    abstract void play();

    abstract Pet getPet();
}
