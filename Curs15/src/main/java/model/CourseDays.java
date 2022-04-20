package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CourseDays {

    private String day;
    private String startingHour;

    public CourseDays(){
        super();
    }

    @Override
    public String toString() {
        return '\n' + "Day {" + '\n' +
                "day: " + day + '\n' +
                "startingHour: " + startingHour + '\n' +
                '}';
    }
}
