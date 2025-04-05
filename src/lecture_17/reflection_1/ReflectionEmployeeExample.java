package lecture_17.reflection_1;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionEmployeeExample {
    public static void main(String[] args) {
        Class<Employee> employeeClass = Employee.class;

        // 1. Имя класса
        System.out.println("Class name: " + employeeClass.getName());

        // 2. Модификатор доступа
        int modifiers = employeeClass.getModifiers();
        System.out.println("Modifiers: " + Modifier.toString(modifiers));

        // 3. Супер-класс
        Class<? super Employee> superclass = employeeClass.getSuperclass();
        System.out.println("Superclass: " + (superclass != null
                ? superclass.getName() : "None"));

        // 4. Интерфейсы
        Class<?>[] interfaces = employeeClass.getInterfaces();
        System.out.println("Interfaces: " + Arrays.toString(interfaces));

        // 5. Поля
        System.out.println("\nFields:");
        Field[] fields = employeeClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Name: " + field.getName()
                    + " Type: " + field.getType().getName()
                    + "Modifier: " + Modifier.toString(field.getModifiers()));
        }

        // 6. Методы
        System.out.println("\nMethods:");
        Method[] methods = employeeClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Name: " + method.getName()
                    + " Return type: " + method.getReturnType().getName());
            System.out.println("Parameter types: "
                    + Arrays.toString(method.getParameterTypes()));
            System.out.println("Modifier: " + Modifier.toString(method.getModifiers()));
        }

        // 7. Конструкторы
        System.out.println("Constructors: ");
        Constructor<?>[] constructors = employeeClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Name: " + constructor.getName());
            System.out.println("Parameter types: "
                    + Arrays.toString(constructor.getParameterTypes()));
            System.out.println("Modifier: " + Modifier.toString(constructor.getModifiers()));
        }

        // 8. Аннотации
        System.out.println("\nAnnotations:");
        Annotation[] annotations = employeeClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getName());
        }

        // 9. Дженерики
        System.out.println("\nGenerics: ");
        /** Вот тут внесла изменения
        Создаем анонимный подкласс, чтобы сохранить информацию о типе Employee
        При создании анонимного подкласса new Container<Employee>() {},
        JVM сохраняет информацию о типе Employee в метаданных класса.
        Это позволяет рефлексии получить доступ к ParameterizedType.
        Без анонимного подкласса (просто new Container<>()) происходит стирание типа
        и информация о Employee теряется. */
        Container<Employee> container = new Container<>() {
        };
        container.setItem(new Employee(1, "Tatiana", 5.6));
        Class<?> containerClass = container.getClass();
        Type genericSuperclass = containerClass.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) { // false
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (Type argument : actualTypeArguments) {
                System.out.println("Type name in Container(Generic Type): "
                        + argument.getTypeName());
            }
        }
        System.out.println("Container hold: " + container.getItem().getName());


    }
}
