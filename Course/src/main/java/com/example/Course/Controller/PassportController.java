package com.example.Course.Controller;

import com.example.Course.Service.PassportService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passport")
public class PassportController {

    @Autowired
    PassportService passportService;

    @PostMapping("/addPassport")
    public String addPassport(@RequestParam("number") String number, @RequestParam("studentId") Integer studentId)
    {
        try
        {
            return passportService.addPassport(number,studentId);
        }catch (Exception e)
        {
            return e.getMessage();
        }

    }
}
