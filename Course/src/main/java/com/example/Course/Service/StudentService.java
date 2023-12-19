package com.example.Course.Service;

import com.example.Course.Entity.Course;
import com.example.Course.Entity.Student;
import com.example.Course.Repository.CourseRepo;
import com.example.Course.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    @Autowired
    CourseRepo courseRepo;
    public String addStudent(String name) {
        Student student = new Student();
        student.setName(name);
        studentRepo.save(student);
        return "student saved into db";
    }

    public String associateStudentWithCourse(Integer studentId, String courseName) throws Exception{
        Course course = courseRepo.findByName(courseName);
        Optional<Student> optionalStudent = studentRepo.findById(studentId);

        if(!optionalStudent.isPresent() || course == null)
        {
            throw new Exception("invalid student or course");
        }

        Student student = optionalStudent.get();

        student.getCourses().add(course);
        course.getStudents().add(student);
        studentRepo.save(student);

        return "student "+student.getName()+" is associated with course "+ course.getName();
    }
}
