package lecture_11.thread_4;

public class ThreadApp {
    public static void main(String[] args) {
        Thread thread = new Thread(
                () ->
        {
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("Thread is running...");
            }
            System.out.println("Thread finished");
        });
        thread.start();

        try{
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();
    }
}
