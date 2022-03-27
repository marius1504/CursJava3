package tema.curs9;

import lombok.Data;

@Data
public class JavaTeacher implements ITeacher {

    private WisdomWordsService wisdomService = new WisdomWordsService();
    private int age;
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

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//
//    public String getWorkPlace() {
//        return workPlace;
//    }
//
//    public void setWorkPlace(String workPlace) {
//        this.workPlace = workPlace;
//    }
}
