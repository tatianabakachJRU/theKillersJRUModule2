package lecture_12.thread_6;

public class RaceConditionExample {
    private int counter = 0;

    public synchronized void increment(){
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        RaceConditionExample raceConditionExample = new RaceConditionExample();
        Thread thread1 = new Thread(() ->{
            for (int i = 0; i < 10_000; i++) {
                raceConditionExample.increment();
            }
        });
        Thread thread2 = new Thread(() ->{
            for (int i = 0; i < 10_000; i++) {
                raceConditionExample.increment();
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

        System.out.println("Counter: " + raceConditionExample.getCounter());
    }
}
