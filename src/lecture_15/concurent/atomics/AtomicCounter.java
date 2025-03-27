package lecture_15.concurent.atomics;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    private AtomicInteger count = new AtomicInteger(0);
    public void increment(){
        count.incrementAndGet();
    }
    public AtomicInteger getCount() {
        return count;
    }
}
