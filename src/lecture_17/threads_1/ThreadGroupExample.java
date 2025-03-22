package lecture_17.threads_1;

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyThreadGroup");

        Thread thread1 = new Thread(group, new MyThread(), "Thread one");
        Thread thread2 = new Thread(group, new MyThread(), "Thread two");
        Thread thread3 = new Thread(group, new MyThread(), "Thread three");

        thread1.start();
        thread2.start();
        thread3.start();

        group.interrupt();
    }
}
