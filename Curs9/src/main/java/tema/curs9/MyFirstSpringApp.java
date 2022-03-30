package tema.curs9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyFirstSpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        JavaTeacher theTeacher = context.getBean("javaTeacher", JavaTeacher.class);

        System.out.println("Wisdom: " + theTeacher.getWisdom());
        System.out.println("Age: " + theTeacher.getAge());
        System.out.println("Work place: " + theTeacher.getWorkPlace());

        context.close();
    }
}
