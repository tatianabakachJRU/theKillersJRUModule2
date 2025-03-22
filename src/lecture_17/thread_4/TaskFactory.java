package lecture_17.thread_4;

public class TaskFactory {
    public static Task createTask(String type){
        if(type.equalsIgnoreCase("high")){
            return new HighPriorityTask();
        } else if (type.equalsIgnoreCase("low")){
            return new LowPriorityTask();
        }
        return null;
    }
}
