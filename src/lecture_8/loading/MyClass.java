package lecture_8.loading;

public class MyClass {
    static int staticField = 10;

    static
    {
        System.out.println("Static block");
    }

    static {
        System.out.println("Static block two");
    }
    static int anotherStaticField = 20;
}
