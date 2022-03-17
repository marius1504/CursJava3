package tema.curs7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class Motocicleta implements IAutomobil{

    Motor motor;

    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String travel() {
        return "You chose to travel with the motorcycle";
    }

    @Override
    public String maxDrivingSpeed() {
        return "180 km/h";
    }
}
