package lecture_11.thread_5;

public class RaceSimulator {

    static class Runner implements Runnable{
        private final String name;
        private final int speed;

        public Runner(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + " step " + i);
                try{
                    Thread.sleep(speed);
                } catch (InterruptedException e) {
                    System.out.println(name + " interrupted");
                    return;
                }
            }
            System.out.println(name + " finished");
        }
    }

    public static void main(String[] args) {
        Thread runner1 = new Thread(new Runner("Усейн Болт", 200));
        Thread runner2 = new Thread(new Runner("Черепаха", 200));
        Thread runner3 = new Thread(new Runner("Кролик", 200));

        runner1.start();
        runner2.start();
        runner3.start();

        try{
            runner1.join();
            runner2.join();
            runner3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Race finished");
    }
}
