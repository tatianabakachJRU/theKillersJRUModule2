package lecture_12.thread_5;

public class WaitNotifyExample {
    private Object lock = new Object();
    private boolean isReady = false;

    public void produce(){
        synchronized (lock){
            isReady = true;
            lock.notify();
            System.out.println("Produced data");
        }
    }

    public void consume(){
        synchronized (lock){
            while (!isReady){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Consumed data");
        }
    }

    public static void main(String[] args) {
        WaitNotifyExample waitNotifyExample = new WaitNotifyExample();

        Thread producerThread = new Thread(waitNotifyExample::produce);
        Thread consumerThread = new Thread(waitNotifyExample::consume);

        producerThread.start();
        consumerThread.start();

    }
}
