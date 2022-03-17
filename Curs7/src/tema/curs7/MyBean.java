package tema.curs7;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MyBean {
    static int objectCounter = 0;
    public MyBean() {
        objectCounter++;
        System.out.println("Current number of instances: " + objectCounter);
    }

    @PostConstruct
    private void init(){
        System.out.println("This method is called at initialization");
    }

    @PreDestroy
    private void destroy(){
        objectCounter--;
        System.out.println("This method is called at destruction. The object counter is: " + objectCounter);
    }
}
