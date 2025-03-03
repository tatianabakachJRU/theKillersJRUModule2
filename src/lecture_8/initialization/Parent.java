package lecture_8.initialization;

public class Parent {
    static int staticParentField = staticParentMethod();
    int parentField = parentMethod();

    static {
        System.out.println("Static block in Parent");
    }

    {
        System.out.println("Non-static block in Parent");
    }

    public Parent() {
        System.out.println("Parent Constructor");
    }

    private int parentMethod() {
        System.out.println("Non-static Field in Parent");
        return 2;
    }

    private static int staticParentMethod() {
        System.out.println("Static Field in Parent");
        return 1;
    }
}
