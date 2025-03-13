package lecture_11.threads_2;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}
