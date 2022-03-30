package tema.curs9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class WisdomWordsServiceConfiguration {

        @Bean
        public WisdomWordsService wisdomWordsService() {
            return new WisdomWordsService();
        }

}
