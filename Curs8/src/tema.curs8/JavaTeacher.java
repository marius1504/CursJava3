package tema.curs8;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

//@Component("myTeacher")
@Getter
@Setter
@Component
public class JavaTeacher implements ITeacher{
    private WisdomWordsService wisdomWordsService;
    private HomeWorkService homeWorkService;



    private String age;



    public JavaTeacher(WisdomWordsService wisdomWordsService, HomeWorkService homeWorkService) {
        this.wisdomWordsService = wisdomWordsService;
        this.homeWorkService = homeWorkService;
        this.age = "The teacher has 28 years";
    }

    @Override
    public String getHomework() {
            return "Create 100 classes";
        }
    @Override
    public String getWisdom() {
            return wisdomWordsService.getMessage();
        }



}
