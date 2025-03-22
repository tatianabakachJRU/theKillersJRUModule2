package lecture_17.threads_3;

import lecture_17.threads_1.MyThread;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        thread1.setPriority(8);
        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
    }
}
