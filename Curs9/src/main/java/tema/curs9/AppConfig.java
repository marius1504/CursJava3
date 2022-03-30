package tema.curs9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Import(WisdomWordsServiceConfiguration.class)
@Configuration
@ComponentScan("tema.curs9")

public class AppConfig {
    @Autowired WisdomWordsService wisdomWordsService;


    @Bean
    public JavaTeacher javaTeacher (){
        return new JavaTeacher(wisdomWordsService);
    }

    @Bean
    public MathTeacher mathTeacher(){
        return new MathTeacher();
    }


}

