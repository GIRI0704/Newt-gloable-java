package com.example.Course.Service;

import com.example.Course.Entity.Passport;
import com.example.Course.Entity.Student;
import com.example.Course.Repository.PassportRepo;
import com.example.Course.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PassportService {

    @Autowired
    PassportRepo passportRepo;
    @Autowired
    StudentRepo studentRepo;

    public String addPassport(String number, Integer studentId) throws Exception {
        Optional<Student> optionalStudent = studentRepo.findById(studentId);
        if(!optionalStudent.isPresent())
            throw new Exception("student id is invalid");

        Student student = optionalStudent.get();

        Passport passport = new Passport();
        passport.setNumber(number);
        passport.setStudent(student);

        student.setPassport(passport);
        studentRepo.save(student);

        return "passport added";
    }
}
