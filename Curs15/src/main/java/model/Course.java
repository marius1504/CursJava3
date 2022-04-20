package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Course {

    private String courseName;
    private Trainer trainer;
    private boolean online;
    private List<CourseDays> courseDays;

    public Course (){
        super();
    }
    @Override
    public String toString() {
        return '\n' + "{" + '\n' +
                "courseName: " + courseName + '\n' +
                "trainer: " + trainer + '\n' +
                "online: " + online + '\n' +
                "courseDays: " + courseDays + '\n' +
                '}'+"\n";
    }
}
