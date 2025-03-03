package lecture_8.staticVar;

public class CounterApp {
    int number = 6;
    static int staticNumber = 6;

    public static void main(String[] args) {
        int i = staticNumber + 7;
        //int i1 = number + 7;

        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        System.out.println(Counter.count);
        System.out.println(counter.nonStaticCount);
        System.out.println(counter2.nonStaticCount);
        System.out.println(counter3.nonStaticCount);
    }

    public static void staticMethod() {
        //nonStaticMethod();
    }


    public void nonStaticMethod() {
        int i = staticNumber + 6;
        staticMethod();
    }

}
