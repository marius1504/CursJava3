package tema.curs6;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;
@Component
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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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

        public void setWisdomWordsService(WisdomWordsService wisdomWordsService) {
            this.wisdomWordsService = wisdomWordsService;
        }

    public String getAge() {
        age = prop.getProperty("age");
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        name = prop.getProperty("teacherName");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
