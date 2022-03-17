package tema.curs7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class Autocar implements IAutomobil{

    @Autowired
    Motor motor;

    @Override
    public String travel() {
        return "You chose to travel with the bus";
    }

    @Override
    public String maxDrivingSpeed() {
        return "120 km/h";
    }
}
