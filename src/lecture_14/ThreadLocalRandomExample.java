package lecture_14;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int threadId = i;
            Thread thread = new Thread(() -> {
                int random = ThreadLocalRandom.current().nextInt(1, 101);
                System.out.println("Thread " + threadId + " generated " + random);
            });
            thread.start();
        }
    }
}
