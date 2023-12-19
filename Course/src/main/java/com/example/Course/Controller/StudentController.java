package com.example.Course.Controller;

import com.example.Course.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public String addStudent(@RequestParam("name") String name)
    {
        System.out.println("in method");
        return studentService.addStudent(name);
    }

    @PutMapping("/associateStudentWithCourse")
    public String associateStudentWithCourse(@RequestParam("id") Integer studentId, @RequestParam("name") String courseName)
    {
        try {
            return studentService.associateStudentWithCourse(studentId,courseName);
        }catch (Exception e)
        {
            return e.getMessage();
        }

    }

}
