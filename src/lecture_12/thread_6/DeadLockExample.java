package lecture_12.thread_6;

public class DeadLockExample {
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void deadLockMethod1(){
        synchronized (lock1){
            System.out.println("Lock 1 acquired");
            synchronized (lock2){
                System.out.println("Lock 2 acquired");
            }
        }
    }

    public void deadLockMethod2(){
        synchronized (lock1){
            System.out.println("Lock 2 acquired");
            synchronized (lock2){
                System.out.println("Lock 1 acquired");
            }
        }
    }

    public static void main(String[] args) {
        DeadLockExample deadLockExample = new DeadLockExample();
        Thread thread1 = new Thread(deadLockExample::deadLockMethod1);
        Thread thread2 = new Thread(deadLockExample::deadLockMethod2);

        thread1.start();
        thread2.start();
    }
}
