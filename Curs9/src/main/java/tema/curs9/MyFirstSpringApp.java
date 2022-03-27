package tema.curs9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        JavaTeacher theTeacher = context.getBean("myTeacher", JavaTeacher.class);

        System.out.println("Wisdom: " + theTeacher.getWisdom());
        System.out.println("Age: " + theTeacher.getAge());
        System.out.println("Work place: " + theTeacher.getWorkPlace());

        context.close();
    }
}
