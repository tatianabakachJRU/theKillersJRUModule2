package lecture_12.thread_1;

public class CounterApp {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() ->{
            for (int i = 0; i < 10_000; i++) {
                counter.increment();
                counter.safeIncrement();
                Counter.staticIncrement();
                counter.decrement();
                counter.safeDecrement();
                Counter.staticDecrement();
            }
        });

        Thread thread2 = new Thread(() ->{
            for (int i = 0; i < 10_000; i++) {
                counter.increment();
                counter.safeIncrement();
                Counter.staticIncrement();
                counter.decrement();
                counter.safeDecrement();
                Counter.staticDecrement();
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

        System.out.println("Final count: " + counter.getCount());
        System.out.println("Final static count: " + Counter.getStaticCount());
    }
}
