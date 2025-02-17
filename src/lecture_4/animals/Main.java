package lecture_4.animals;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();
        Flying flyingBird = new Bird();
        dog.eat();
        Animal.staticMethod();
    }
}
