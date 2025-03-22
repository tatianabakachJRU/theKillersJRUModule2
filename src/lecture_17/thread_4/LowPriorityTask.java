package lecture_17.thread_4;

public class LowPriorityTask implements Task{
    @Override
    public void execute() {
        System.out.println("Low Priority Task");
    }
}
