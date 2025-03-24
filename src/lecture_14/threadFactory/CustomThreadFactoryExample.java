package lecture_14.threadFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class CustomThreadFactoryExample {
    public static void main(String[] args) {
        ThreadFactory threadFactory = new CustomThreadFactory(Thread.MAX_PRIORITY);

        ExecutorService executorService
                = Executors.newFixedThreadPool(3, threadFactory);

        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskId + " is running in thread: "
                        + Thread.currentThread().getName() + " priority "
                        + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskId + " is completed in thread: "
                        + Thread.currentThread().getName() + " priority "
                        + Thread.currentThread().getPriority());
            });
        }
        executorService.shutdown();
    }
}
