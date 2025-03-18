package lecture_12.thread_1;

public class Counter {
    private int count;

    public synchronized void increment(){
        count++;
    }

    public synchronized void decrement(){
        count--;
    }

    public void safeIncrement(){
        synchronized (this){
            count++;
        }
    }

    private final Object look = new Object();
    public void safeDecrement(){
        synchronized (look){
            count--;
        }
    }

    private static int staticCount = 0;

    public static synchronized void staticIncrement(){
        staticCount++;
    }

    public static synchronized void staticDecrement(){
        staticCount--;
    }

    public int getCount() {
        return count;
    }

    public static int getStaticCount() {
        return staticCount;
    }
}
