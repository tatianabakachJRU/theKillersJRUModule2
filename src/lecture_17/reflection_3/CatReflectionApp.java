package lecture_17.reflection_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CatReflectionApp {
    public static void main(String[] args) {
        try{
            Cat jerry = new Cat("Jerry", 10);
            System.out.println(jerry);

            Class<? extends Cat> catClass = jerry.getClass();
            Field catFieldName = catClass.getDeclaredField("name");
            catFieldName.setAccessible(true);
            catFieldName.set(jerry, "Whiskars");
            System.out.println(jerry);

            Method catMethodMeow = catClass.getDeclaredMethod("meow");
            catMethodMeow.setAccessible(true);
            catMethodMeow.invoke(jerry);

            Class<?>[] parameterTypes = {};
            Constructor<? extends Cat> catPrivateConstructor =
                    catClass.getDeclaredConstructor(parameterTypes);
            catPrivateConstructor.setAccessible(true);
            Cat cat = catPrivateConstructor.newInstance();
            System.out.println(cat);


        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException |
                 InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
