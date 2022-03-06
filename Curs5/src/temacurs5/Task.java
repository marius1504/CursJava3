package temacurs5;

import java.util.Random;
import java.util.concurrent.TimeUnit;
public class Task {

    private final String taskName;
    private final Integer taskId;
    private final Integer executionTime;

    static int numberOfTasks = 0;

    public void run() throws InterruptedException {
        System.out.println("The application sleeps for " + executionTime + " seconds, then the next task will be ran");
        TimeUnit.SECONDS.sleep(executionTime);
    }

    private Integer generateId(){
        int int_random = new Random().nextInt(Integer.MAX_VALUE);
        return int_random;
    }


    public Task(){
        numberOfTasks++;
        this.executionTime = new Random().nextInt(20);
        this.taskId = generateId();
        this.taskName = "Task nr." + taskId;
    }

    public void destroy(){
        System.out.println("The task: " + taskName + " was destroyed");
        numberOfTasks--;
    }



}
