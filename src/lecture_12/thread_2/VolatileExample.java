package lecture_12.thread_2;

import lecture_12.thread_1.Counter;

public class VolatileExample {
    private volatile boolean flag;

    private volatile int count;

    public void demoVolatile() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                flag = !flag;
                count++;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                flag = !flag;
                count++;
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Flag: " + flag);
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        VolatileExample volatileExample = new VolatileExample();
        volatileExample.demoVolatile();
    }
}
