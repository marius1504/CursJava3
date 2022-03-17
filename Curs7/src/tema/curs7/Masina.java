package tema.curs7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class Masina implements IAutomobil{

    Motor motor;

    @Autowired
    public Masina(Motor motor) {
        this.motor = motor;
    }


    @Override
    public String travel() {
        return "You chose to travel with the car";
    }

    @Override
    public String maxDrivingSpeed() {
        return "200 km/h";
    }


}
