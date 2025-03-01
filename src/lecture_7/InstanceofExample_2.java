package lecture_7;

import java.util.ArrayList;

public class InstanceofExample_2 {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) {
            if(animal instanceof Dog){
                System.out.println("This is a dog.");
            } else if (animal instanceof Cat){
                System.out.println("This is a cat.");

            }
        }
    }
}
