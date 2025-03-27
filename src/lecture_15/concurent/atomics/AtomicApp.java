package lecture_15.concurent.atomics;

public class AtomicApp {
    public static void main(String[] args) {
        NonAtomicCounter nonAtomicCounter = new NonAtomicCounter();
        long startNonAtomic = System.nanoTime();
        runThread(nonAtomicCounter);
        long durationNonAtomic = System.nanoTime() - startNonAtomic;
        System.out.println("NonAtomicCounter: " + nonAtomicCounter.getCount());
        System.out.println(durationNonAtomic/1_000_000);

        AtomicCounter atomicCounter = new AtomicCounter();
        long startAtomic = System.nanoTime();
        runThread(atomicCounter);
        long durationAtomic = System.nanoTime() - startAtomic;
        System.out.println("AtomicCounter: " + atomicCounter.getCount());
        System.out.println(durationAtomic/1_000_000);

    }

    private static void runThread(Object counter) {
        Thread thread1 = new Thread(() ->{
            for (int i = 0; i < 1_000_000; i++) {
                if(counter instanceof NonAtomicCounter){
                    ((NonAtomicCounter) counter).increment();
                } else if(counter instanceof AtomicCounter) {
                    ((AtomicCounter) counter).increment();
                }
            }
        });
        Thread thread2 = new Thread(() ->{
            for (int i = 0; i < 1_000_000; i++) {
                if(counter instanceof NonAtomicCounter){
                    ((NonAtomicCounter) counter).increment();
                } else if(counter instanceof AtomicCounter) {
                    ((AtomicCounter) counter).increment();
                }
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

    }
}
