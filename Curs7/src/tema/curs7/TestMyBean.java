package tema.curs7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBean {
    public static void main(String[] args) {
        System.out.println("----- Before context initialization");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("----- Before getBean calls");

        context.getBean("myBean", MyBean.class);
        context.getBean("myBean", MyBean.class);
        context.getBean("myBean", MyBean.class);

        System.out.println("----- After getBean calls");
        System.out.println("Current number of instances: " + MyBean.objectCounter);

        // close the context
        context.close();
        System.out.println("----- After context closed");

    }
}
