package com.example.Course;

import com.example.Course.Entity.Course;
import com.example.Course.Repository.CourseRepo;
import jakarta.transaction.Transactional;
import org.junit.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseControllerTest {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    CourseRepo courseRepo;
    @Test
    public void findById()
    {
        Optional<Course> optionalCourse = courseRepo.findById(1);
        Course course = optionalCourse.get();
        assertEquals("java",course.getName());
    }

    @Test
    @DirtiesContext
    public void deleteById() {
        // Delete the course with ID 2
        courseRepo.deleteById(1);
        // Check if the course with ID 2 is not present after deletion
        Optional<Course> optionalCourse = courseRepo.findById(1);
        assertFalse(optionalCourse.isPresent(), "Course with ID 1 should be deleted");
    }

    @Test
    public void add()
    {
        Course course = courseRepo.findById(1).get();
    }

    @Test
    @Transactional
    public void findByIdFirstLevelCache()
    {
        Course course = courseRepo.findById(1).get();
        logger.log(Level.INFO, "first course", course);

        assertEquals("java",course.getName());
    }
}
