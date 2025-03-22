package lecture_17.threads_3;

public class PriorityExample {
    public static void main(String[] args) {
        Thread highPriorityThread = new Thread(new MyPriorityRunnable(Thread.MAX_PRIORITY));
        Thread normalPriorityThread = new Thread(new MyPriorityRunnable(Thread.NORM_PRIORITY));
        Thread lowPriorityThread = new Thread(new MyPriorityRunnable(Thread.MIN_PRIORITY));

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);


        normalPriorityThread.start();
        lowPriorityThread.start();
        highPriorityThread.start();
    }
}
