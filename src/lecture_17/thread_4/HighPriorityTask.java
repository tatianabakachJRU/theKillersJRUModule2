package lecture_17.thread_4;

public class HighPriorityTask implements Task{
    @Override
    public void execute() {
        System.out.println("High Priority Task");
    }
}
