package tema.curs6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringAnnotationApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");



        System.out.println("Trying to initialize teacher");
        HistoryTeacher myFirstTeacher = context.getBean("historyTeacher", HistoryTeacher.class);
        System.out.println(myFirstTeacher.getHomework());
        System.out.println(myFirstTeacher.getWisdom());
        System.out.println("Trying to initialize teacher");
        MathTeacher mySecondTeacher = context.getBean("mathTeacher", MathTeacher.class);
        System.out.println("The teacher's name is: " + mySecondTeacher.getName());
        System.out.println("AGE " + mySecondTeacher.getAge());
        System.out.println(mySecondTeacher.getHomework());
        System.out.println(mySecondTeacher.getWisdom());

    }

}
