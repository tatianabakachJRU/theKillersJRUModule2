package lecture_18.annotations_1;

import java.util.ArrayList;
import java.util.List;

public class StandartAnnotationExample {
    @Override
    public String toString() {
        return "StandartAnnotationExample{}";
    }

    public static void main(String[] args) {

    }

    @Deprecated
    public static void oldMethod(){
        System.out.println("This is old method");
    }

    @SuppressWarnings("rawtypes")
    public static void suppressedMethod(){
        List list = new ArrayList();
    }

    @SafeVarargs
    public static <T> void printArray (T... elements){
        for (T element : elements) {
            System.out.println(element);
        }
    }





}
