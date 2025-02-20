package lecture_5;

import lecture_1.abstraction.Cat;

public class ZooApp {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Zoo<Cat> zoo = new Zoo<>(Cat.class); // вот тут передается тип!
        Cat tiger = zoo.createNewAnimal();
    }
}
