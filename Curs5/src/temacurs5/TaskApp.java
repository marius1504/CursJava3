package temacurs5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaskApp {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Task firstTask = context.getBean("myTask", Task.class);
        firstTask.run();
        System.out.println("Current number of ran tasks is: " + Task.numberOfTasks);

        Task secondTask = context.getBean("myTask", Task.class);
        secondTask.run();
        System.out.println("Current number of ran tasks is: " + Task.numberOfTasks);



        secondTask.destroy();
        System.out.println("Current number of ran tasks is: " + Task.numberOfTasks);


        Task thirdTask = context.getBean("myTask", Task.class);
        thirdTask.run();
        System.out.println("Current number of ran tasks is: " + Task.numberOfTasks);

        context.close();
        System.out.println("The context is closed");


    }

}
