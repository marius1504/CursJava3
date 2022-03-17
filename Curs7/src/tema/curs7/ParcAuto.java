package tema.curs7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParcAuto {

    @Autowired
    Autocar autocar;

    Masina masina;
    Motocicleta motocicleta;

    @Autowired
    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    @Autowired
    public ParcAuto(Motocicleta motocicleta) {
        this.motocicleta = motocicleta;
    }


}
