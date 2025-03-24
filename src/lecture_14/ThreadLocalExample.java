package lecture_14;

public class ThreadLocalExample {
    private static final ThreadLocal<Integer> threadLocal =
            ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable task = () -> {
            Integer valueThreadLocal = threadLocal.get();
            System.out.println(Thread.currentThread().getName()
                    + " thread local: " + valueThreadLocal);

            threadLocal.set(valueThreadLocal + 5);
            System.out.println(Thread.currentThread().getName()
                    + " thread local: " + threadLocal.get());
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
