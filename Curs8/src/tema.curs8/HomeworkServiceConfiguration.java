package tema.curs8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HomeworkServiceConfiguration {
    @Bean
    public HomeWorkService homeWorkService() {
        return new HomeWorkService();
    }
}
