package lecture_14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executorService.submit(() ->{
                System.out.println("Task " + taskId + " is running in thread: "
                        + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskId + " is completed in thread: "
                        + Thread.currentThread().getName());
            });

        }
        executorService.shutdown();
    }
}
