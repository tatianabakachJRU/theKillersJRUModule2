package lecture_11.thread_3;

public class SleepThreadApp {
    public static void main(String[] args) {
        Thread thread = new Thread(new SleepThread());
        thread.start();
        Thread thread2 = new Thread(new SleepThread());
        thread2.start();


    }
}
