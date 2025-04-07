package lecture_18.annotations_2;

import java.lang.reflect.Method;

public class MyAnnotationApp {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        try {
            Method method = testClass.getClass().getMethod("annotatedMethod");
            if (method.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                String value = annotation.value();
                int number = annotation.number();
                System.out.println(value);
                System.out.println(number);
            }
            testClass.annotatedMethod();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }
}
