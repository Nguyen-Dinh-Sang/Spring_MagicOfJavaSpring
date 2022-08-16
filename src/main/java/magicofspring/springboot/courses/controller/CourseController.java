package magicofspring.springboot.courses.controller;

import magicofspring.springboot.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourse() {
        return Arrays.asList(new Course(1, "Learn Microservices", "in28minutes"));
    }
}
