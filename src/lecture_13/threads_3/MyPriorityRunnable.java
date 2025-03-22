package lecture_13.threads_3;

public class MyPriorityRunnable implements Runnable{
    private int priority;

    public MyPriorityRunnable(int priority) {
        this.priority = priority;
    }

    @Override
    public void run() {
        System.out.println("Thread with priority: " + priority + " is running");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread with priority: " + priority + ", " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}
