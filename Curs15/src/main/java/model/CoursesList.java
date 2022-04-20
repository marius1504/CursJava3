package model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class CoursesList {
    private List<Course> coursesList;
    @Override
    public String toString() {
        return "List of courses { " + '\n' +
                "coursesList: " + coursesList +
                '}' + '\n' ;
    }
}
