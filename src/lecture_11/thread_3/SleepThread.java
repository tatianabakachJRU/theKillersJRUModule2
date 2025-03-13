package lecture_11.thread_3;

public class SleepThread implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Before sleep " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("After sleep " + Thread.currentThread().getName());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
