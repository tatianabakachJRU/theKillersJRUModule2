package lecture_12.thread_3;

public class YieldApp {
    public static void main(String[] args) {
        Thread thread1 = new Thread(
                new YieldExample("Thread 1 (with yield)", true));

        Thread thread2 = new Thread(
                new YieldExample("Thread 2 (without yield)", false));

        thread1.start();
        thread2.start();
    }
}
