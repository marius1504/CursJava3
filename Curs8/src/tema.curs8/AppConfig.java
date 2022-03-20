package tema.curs8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@PropertySource(value = {"classpath:resources/config.properties"})
@Import({WisdomServiceConfiguration.class, HomeworkServiceConfiguration.class})
@Configuration
@ComponentScan("curs8")

public class AppConfig {
    @Autowired WisdomWordsService wisdomWordsService;
    @Autowired HomeWorkService homeWorkService;

    @Bean
    public JavaTeacher javaTeacher (){
        return new JavaTeacher( wisdomWordsService, homeWorkService);
    }

    @Bean
    public HistoryTeacher historyTeacher(){
        return new HistoryTeacher();
    }
//
//    @Bean
//    public MathTeacher mathTeacher(){
//        return new MathTeacher();
//    }

}
