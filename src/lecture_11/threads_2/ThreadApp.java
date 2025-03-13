package lecture_11.threads_2;

public class ThreadApp {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();

        Thread runThread = new Thread(new MyRunnable());
        runThread.start();

        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}
