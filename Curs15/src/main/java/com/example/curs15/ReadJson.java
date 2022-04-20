package com.example.curs15;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Course;
import model.CoursesList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@SpringBootApplication
public class ReadJson {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(ReadJson.class, args);
        ObjectMapper mapper = new ObjectMapper();

        Course course = mapper.readValue(new File("Curs15/src/main/resources/exempludejson.json"), Course.class);
        System.out.println(course.toString());

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        File fileArray = new ClassPathResource("jsonArrayList.json").getFile();
        String json = fileArray.toString();
        StringBuilder contentBuilderArray = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(json)))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                contentBuilderArray.append(sCurrentLine).append("\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();

        }

        CoursesList coursesList = mapper.readValue(contentBuilderArray.toString(), CoursesList.class);
        System.out.println(coursesList);

    }
}
