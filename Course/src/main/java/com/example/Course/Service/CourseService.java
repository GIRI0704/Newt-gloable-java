package com.example.Course.Service;

import com.example.Course.Entity.Course;
import com.example.Course.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    public Course findById(Integer id) throws Exception {

        Optional<Course> optionalCourse = courseRepo.findById(id);

        if(!optionalCourse.isPresent())
            throw new Exception("course id is invalid");

        return optionalCourse.get();
    }

    public String addCourse(String name) {
        Course course = new Course();
        course.setName(name);
        courseRepo.save(course);
        return "course added in db";
    }

    public String deleteById(Integer id)
    {
        courseRepo.deleteById(id);
        return "course deleted on db";
    }
}
