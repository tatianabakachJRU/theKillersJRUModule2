package lecture_8.staticVar;

public class Counter {
    static int count = 0;
    public int nonStaticCount = 0;

    public Counter() {
        count++;
        nonStaticCount++;
    }
}
