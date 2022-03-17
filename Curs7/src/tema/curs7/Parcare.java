package tema.curs7;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Parcare {

    @Autowired
    @Qualifier("masina")
    IAutomobil masina;


}
