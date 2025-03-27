package lecture_15.concurent.atomics;

public class NonAtomicCounter {
    private int count = 0;
    public synchronized void increment(){
        count++;
    }
    public int getCount() {
        return count;
    }
}
