package curs5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyFirstSpringAnnotationApp {

    public static void main(String[] args) {
        // citeste fisierul de configurare
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        // obtine bean-ul din container-ul de spring
        WebDevTeacher teacher = context.getBean("webDevTeacher", WebDevTeacher.class);

        // inchide contextul
        System.out.println("Context closing and all beans are being destroyed");
        context.close();
    }
}