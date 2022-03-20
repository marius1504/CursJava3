package tema.curs8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyFirstSpringAnnotationApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);



        System.out.println("Trying to initialize teacher");
        HistoryTeacher myFirstTeacher = context.getBean("historyTeacher", HistoryTeacher.class);
        System.out.println(myFirstTeacher.getHomework());
        System.out.println(myFirstTeacher.getWisdom());
        System.out.println("Trying to initialize teacher");
//        MathTeacher mySecondTeacher = context.getBean("mathTeacher", MathTeacher.class);
//        System.out.println("The teacher's name is: " + mySecondTeacher.getName());
//        System.out.println("AGE " + mySecondTeacher.getAge());
//        System.out.println(mySecondTeacher.getHomework());
//        System.out.println(mySecondTeacher.getWisdom());
        ITeacher teacher = context.getBean("javaTeacher", JavaTeacher.class);
        System.out.println(teacher.getWisdom());
        System.out.println(teacher.getHomework());
        System.out.println(((JavaTeacher) teacher).getAge());




    }

}
