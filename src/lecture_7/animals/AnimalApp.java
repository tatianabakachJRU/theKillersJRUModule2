package lecture_7.animals;

import java.util.*;
import java.util.stream.Collectors;

public class AnimalApp {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Dog("Rex"),
                new Cat("Whiskers"),
                new Cow("Bessie"),
                new Dog("Luna"),
                new Cat("Boss"),
                new Dog("Buddy")
        );

        System.out.println("Animals sounds:");
        animals.stream()
                .map(animal -> animal.getName() + " says: " + animal.makeSound())
                .forEach(System.out::println);

        System.out.println("*".repeat(15));

        System.out.println("Dogs:");
        animals.stream()
                .filter(animal -> animal instanceof Dog)
                .map(Animal::getName)
                .forEach(System.out::println);

        System.out.println("*".repeat(15));
        System.out.println("Sorted animals by name:");
        animals.stream()
                .sorted(Comparator.comparing(Animal::getName))
                .map(animal -> animal.getName())
                .forEach(System.out::println);

        System.out.println("*".repeat(15));
        System.out.println("Animals sorted by type:");
        Map<String, List<String>> animalMap = animals.stream()
                .collect(Collectors.groupingBy(Animal::getType,
                        Collectors.mapping(Animal::getName,
                                Collectors.toList())));

        animalMap.forEach((type, name) -> System.out.println(type + ": " + name));


    }
}
