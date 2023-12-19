package com.example.Course.Controller;

import com.example.Course.Entity.Course;
import com.example.Course.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/findById")
    public ResponseEntity findById(Integer id)
    {
        try {
            Course course = courseService.findById(id);
            return new ResponseEntity<>(course, HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
        }
    }

    @PostMapping("/addCourse")
    public String addCourse(@RequestParam("name") String name)
    {
        return courseService.addCourse(name);
    }

    @DeleteMapping("/deleteById")
    public String deleteById(Integer id)
    {
        return courseService.deleteById(id);
    }
}
