package tema.curs7;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Getter
@Setter
@Scope("prototype")
@Component
public class Motor {

    private int putere;
    private String nume;
    private int numarCilindri;
    private static Random random = new Random();

    private String numeMotor(){
        String[] tipMotor = {"cu ardere interna", "hybrid", "electric"};
        int rnd = new Random().nextInt(tipMotor.length);
        return tipMotor[rnd];
    }


    public Motor(){
        int min_val = 3;
        int max_val = 8;
        this.nume = numeMotor();
        this.putere = random.nextInt(300);
        this.numarCilindri = min_val + random.nextInt((max_val - min_val) + 1);
    }

    public String detaliiAutomobil(){
        return "Autovehiculul are un motor " + this.nume + " in " + this.numarCilindri + " cilindri si dezvolta o putere de "
                + this.putere + " cai putere";
    }

}
