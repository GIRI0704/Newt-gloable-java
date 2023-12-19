package com.example.JpaHibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)  //---->  is used to tell JUnit to run the test with the Spring test runner.
@SpringBootTest(classes = JpaHibernateApplication.class)  //---> is used to indicate that the
// -->>>>>>   tests should load the Spring Boot application context.
public class JPQLTest {
    private Logger logger = LoggerFactory.getLogger(JpaHibernateApplication.class);
    @Autowired
    EntityManager entityManager;
    @Test
    public void findById()
    {
       List result =  entityManager.createQuery("select c from Course c").getResultList();
       logger.info("select c from Course c -> {}", result);
    }

    @Test
    public void findByIdTyped()
    {
        TypedQuery<Course> typedQuery =  entityManager.createQuery("select c from Course c", Course.class);
        List<Course> result = typedQuery.getResultList();
        logger.info("select c from Course c -> {}", result);
    }
}
