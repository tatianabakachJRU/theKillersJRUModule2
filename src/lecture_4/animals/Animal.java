package lecture_4.animals;

import java.io.Closeable;

public interface Animal {

    String DEFAULT_NAME = "Animal";

    static void staticMethod(){

    }

    void makeSound();

    default void eat(){
        System.out.println("Animal eats");
    }

}
