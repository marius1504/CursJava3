package tema.curs9;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class JavaTeacher implements ITeacher {

    private WisdomWordsService wisdomService;
    private String age;
    private String workPlace;

    public JavaTeacher(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }

    @Override
    public String getHomeWork() {
        return "Create 100 classes";
    }

    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }

    public String getAge() {
        return "The teacher has 28 years";
    }
    public String getWorkPlace() {
        return "The teacher works at Devmind";
    }
//
}
