package lecture_17.threads_2;

import lecture_17.threads_1.MyThread;

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyThreadGroup");

        Thread thread1 = new Thread(group, new MyThread(), "Thread one");
        Thread thread2 = new Thread(group, new MyThread(), "Thread two");
        Thread thread3 = new Thread(group, new MyThread(), "Thread three");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Group Name: " + group.getName());
        System.out.println("Group Parent: " + (
                group.getParent() != null ? group.getParent().getName() : "No Parent"));
        group.interrupt();

        int activeCount = group.activeCount();
        System.out.println("Active Thread Count: " + activeCount);
    }
}
