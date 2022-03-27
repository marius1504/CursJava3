package tema.curs9;

import lombok.Data;

@Data
public class MathTeacher implements ITeacher {
    private WisdomWordsService wisdomService;
    private static final String MATH_TEACHER_PREFIX = "Math teacher says: ";

    @Override
    public String getHomeWork() {
        return "Create 100 classes";
    }

    @Override
    public String getWisdom() {
        return MATH_TEACHER_PREFIX + wisdomService.getMessage();
    }

//    public void setWisdomService(WisdomWordsService wisdomSevice) {
//        this.wisdomService = wisdomSevice;
//    }
}
