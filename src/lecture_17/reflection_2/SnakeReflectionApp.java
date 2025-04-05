package lecture_17.reflection_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SnakeReflectionApp {
    public static void main(String[] args) {
        try {
            Class<Snake> snakeClass = Snake.class;
            Constructor<Snake> constructor1 = snakeClass.getConstructor(String.class, int.class);
            Snake snake1 = (Snake)constructor1.newInstance("Snaky", 300);
            System.out.println(snake1);

            Constructor<Snake> constructor = snakeClass.getConstructor();
            Snake snake2 = constructor.newInstance();
            System.out.println(snake2);

        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
