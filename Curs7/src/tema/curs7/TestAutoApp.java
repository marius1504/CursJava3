package tema.curs7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Parcare parcare = context.getBean("parcare", Parcare.class);
        ParcAuto parcAuto = context.getBean("parcAuto", ParcAuto.class);

        System.out.println(parcare.masina.travel());
        System.out.println(parcare.masina.maxDrivingSpeed());
        System.out.println(parcAuto.masina.motor.detaliiAutomobil());
        System.out.println(parcAuto.autocar.motor.detaliiAutomobil());
        System.out.println(parcAuto.motocicleta.motor.detaliiAutomobil());

    }
}
