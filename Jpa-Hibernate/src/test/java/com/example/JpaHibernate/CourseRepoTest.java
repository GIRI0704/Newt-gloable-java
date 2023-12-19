package com.example.JpaHibernate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

@RunWith(SpringRunner.class)  //---->  is used to tell JUnit to run the test with the Spring test runner.
@SpringBootTest(classes = JpaHibernateApplication.class)  //---> is used to indicate that the
// -->>>>>>   tests should load the Spring Boot application context.
public class CourseRepoTest {
    private Logger logger = LoggerFactory.getLogger(JpaHibernateApplication.class);
    @Autowired
    CourseRepo courseRepo;
    @Test
    public void findById()
    {
        Course course = courseRepo.findById(2);
        assertEquals("python",course.getName());
    }

    @Test
    @DirtiesContext // spring reset the data after this test method is completed
    public void deleteById()
    {
        courseRepo.deleteById(2);
        assertNull(courseRepo.findById(2));
    }

    @Test
    @DirtiesContext // spring reset the data after this test method is completed
    public void Save()
    {
        Course course = courseRepo.findById(2);
        assertEquals("python",course.getName());

        course.setName("tamil"); // update

        courseRepo.save(course);

        Course course1 = courseRepo.findById(2);

        assertEquals("tamil",course.getName());
    }

    @Test
    @DirtiesContext
    public void playWithEntityManager()
    {
        courseRepo.playWithEntityManager();
    }
}
