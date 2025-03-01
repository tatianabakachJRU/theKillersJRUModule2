package lecture_7;


public class InstanceofExample_1 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Dog rex = null;

        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(dog instanceof Object);

        System.out.println(rex instanceof Dog);

        Cat cat = new Cat();
        System.out.println(cat instanceof Eating);
        System.out.println(dog instanceof Eating);

    }

}
