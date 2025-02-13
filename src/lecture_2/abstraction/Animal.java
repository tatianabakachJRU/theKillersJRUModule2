package lecture_2.abstraction;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    protected abstract void makeSound();

    public void printName(){
        System.out.println("This animal name is: " + name);
    }
}
