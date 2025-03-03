package lecture_8.staticClasses;

public class OuterInnerApp {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        int staticNumber = Outer.staticNumber;
    }
}
