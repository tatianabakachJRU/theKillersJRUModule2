package lecture_11.threads_1;

public class ThreadApp {
    public static void main(String[] args) {
        // 1
        Thread myThread = new MyThread();
        myThread.start();

        //2
        Thread runThread = new Thread(new MyRunnable());
        runThread.start();

        // 3
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread " + i);
        }
    }
}
