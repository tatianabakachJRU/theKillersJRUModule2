package lecture_17.thread_4;

public class ThreadFactoryExample {
    public static void main(String[] args) {
        Task highPriorityTask = TaskFactory.createTask("high");
        Task lowPriorityTask = TaskFactory.createTask("low");

        Thread high = new Thread(highPriorityTask::execute);
        Thread low = new Thread(lowPriorityTask::execute);

        high.start();
        low.start();
    }
}
