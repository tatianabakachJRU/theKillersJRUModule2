package lecture_12.thread_4;

public class JoinExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Step " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();

        try {
            thread.join(500); // main остановила на 500
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(thread.isAlive()){
            System.out.println("Thread is steel running...");
        } else {
            System.out.println("Thread has finished execution");
        }
        System.out.println("Main finished");
    }
}
