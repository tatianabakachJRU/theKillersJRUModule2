package lecture_11.threads_2;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}
