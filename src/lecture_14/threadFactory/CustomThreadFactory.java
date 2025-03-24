package lecture_14.threadFactory;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {
    private int threadCount = 1;
    private int threadPriority;

    public CustomThreadFactory(int threadPriority) {
        this.threadPriority = threadPriority;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("Worked thread " + threadCount++);
        thread.setPriority(threadPriority);
        return thread;
    }
}
