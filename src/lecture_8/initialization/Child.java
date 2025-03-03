package lecture_8.initialization;

public class Child extends Parent{


    static {
        System.out.println("Static block in Child");
    }

    static int staticChildField = staticChildMethod();

    {
        System.out.println("Non-static block in Child");
    }
    int childField = childMethod();
    
    public Child() {
        System.out.println("Child constructor");
    }

    private int childMethod() {
        System.out.println("Non-static Field in Child");
        return 4;
    }

    private static int staticChildMethod() {
        System.out.println("Static Field in Child");
        return 3;

    }
}
