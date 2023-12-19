package com.example.Course;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
@Component
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(public String com.example.Course.Controller.StudentController.addStudent(String))")
    public void before() {
        logger.info("-----------------------------------------------------AM IN LOGGER");
    }

    @After("execution(public String com.example.Course.Controller.StudentController.addStudent(String))")
    public void after() {
        logger.info("-----------------------------------------------------AM IN LOGGER");
    }

}
