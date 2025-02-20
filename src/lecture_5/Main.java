package lecture_5;

import lecture_1.abstraction.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(1);
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");
        Box<Boolean> booleanBox = new Box<>();
        booleanBox.setItem(true);
        Box<Cat> catBox = new Box<>();
        Box<Box> boxBox = new Box<>();
        ArrayList<Boolean> objects = new ArrayList<>();


        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        NumberBox<Double> doubleNumberBox = new NumberBox<>();
        NumberBox<Number> catNumberBox = new NumberBox<>();

        List<String> strings = Arrays.asList("A", "Cat", "B");
        List<Integer> integers = Arrays.asList(1, 3, 5);

        printList(strings);
        printList(integers);

        List<?> list = new ArrayList<>();
        list.add(null);


        // PECS
        List<? extends Number> numbers = new ArrayList<>();
        Number number = numbers.get(0);

        List<? super Integer> objects1 = new ArrayList<>();
        objects1.add(1);
        Object i = objects1.get(0);


    }

    public static void printList(List<?> list){
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
