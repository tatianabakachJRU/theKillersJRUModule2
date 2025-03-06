package lecture_9.getClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnimalApp {
    public static void main(String[] args) {
        try {
            Class<?> cat1 = Class.forName("lecture_9.getClass.Cat");
            System.out.println(cat1.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Cat cat = new Cat("Whiskars", 3);
        Class<? extends Cat> catClass = cat.getClass();

        System.out.println(catClass.getName());

        Method[] method = catClass.getMethods();
        System.out.println(Arrays.toString(method));
        Method[] declaredMethods = catClass.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));

        Constructor<?>[] constructors = catClass.getConstructors();
        System.out.println(Arrays.toString(constructors));

        Field[] fields = catClass.getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        try {
            Method method1 = catClass.getMethod("eat");
            method1.invoke(cat);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Cat boris = new Cat("Boris", 1, "Tatiana");
        System.out.println(boris);

        try {
            Field owner = boris.getClass().getDeclaredField("owner");
            owner.setAccessible(true);
            owner.set(boris, "Valentyna");
            System.out.println(boris);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        try {
            Method sleep = boris.getClass().getDeclaredMethod("sleep");
            sleep.setAccessible(true);
            sleep.invoke(boris);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
