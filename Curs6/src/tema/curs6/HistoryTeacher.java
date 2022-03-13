package tema.curs6;

import org.springframework.stereotype.Component;

@Component
    public class HistoryTeacher implements ITeacher{
        @Override
        public String getHomework() {
            return "Learn about WW1";
        }

        @Override
        public String getWisdom() {
            return "Those who do not learn from history are doomed to repeat it";
        }

}
