package com.example.JpaHibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaHibernateApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(JpaHibernateApplication.class);

	@Autowired
	private CourseRepo courseRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = courseRepo.findById(1);

		logger.info("course id 1 -> {}",course.toString());
		courseRepo.deleteById(1);
		courseRepo.playWithEntityManager();
	}
}
