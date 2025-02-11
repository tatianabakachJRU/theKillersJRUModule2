package lecture_1.abstraction;

public abstract class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    // Abstract method
    public abstract void makeSound();

    public void printName(){
        System.out.println("This pet name is: " + name);
    }
}
