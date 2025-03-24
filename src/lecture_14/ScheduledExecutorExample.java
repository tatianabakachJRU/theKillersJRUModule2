package lecture_14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorExample {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        executorService.scheduleAtFixedRate(
                () -> {
                    System.out.println("Scheduled task is running in "
                            + Thread.currentThread().getName());
                },
                3,
                2,
                TimeUnit.SECONDS);

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
