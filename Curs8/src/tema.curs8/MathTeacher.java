package tema.curs8;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

@Getter
@Setter
@Component
@Data
    public class MathTeacher implements ITeacher{
    private WisdomWordsService wisdomWordsService;
    Properties prop = new Properties();
    private String age;
    private String name;
    ClassLoader classLoader = getClass().getClassLoader();
    File file = new File(Objects.requireNonNull(classLoader.getResource("config.properties")).getFile());
    FileReader reader;

    {
        try {
            reader = new FileReader(file);
            prop.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final String MATH_TEACHER_PREFIX = "Math teacher says: ";



    @Override
    public String getHomework() {
            return MATH_TEACHER_PREFIX  + "Solve 100 calculus problems";
        }
    @Override
    public String getWisdom() {
        if (wisdomWordsService == null) {
            throw new RuntimeException("some message");
        }
        return MATH_TEACHER_PREFIX + wisdomWordsService.getMessage();
    }
    public String getAge() {
        age = prop.getProperty("age");
        return age;
    }


    public String getName() {
        name = prop.getProperty("teacherName");
        return name;
    }

}
