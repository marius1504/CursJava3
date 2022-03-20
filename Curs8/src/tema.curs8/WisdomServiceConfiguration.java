package tema.curs8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WisdomServiceConfiguration {

    @Bean
    public WisdomWordsService wisdomWordsService() {
        return new WisdomWordsService();
    }
}
