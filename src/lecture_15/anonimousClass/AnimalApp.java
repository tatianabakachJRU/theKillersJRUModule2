package lecture_15.anonimousClass;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            void eat() {
                System.out.println("Cat is eating fish");
            }
        };

        Sound dogSound = new Sound() {
            @Override
            public void makeSound() {
                System.out.println("Wow-wow");
            }
        };

        cat.eat();
        dogSound.makeSound();
    }
}
