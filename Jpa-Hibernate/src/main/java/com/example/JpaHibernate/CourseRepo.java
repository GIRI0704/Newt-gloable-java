package com.example.JpaHibernate;

import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseRepo {
    private Logger logger = LoggerFactory.getLogger(JpaHibernateApplication.class);

    @Autowired
    EntityManager entityManager;

    public Course findById(Integer id)
    {
        return entityManager.find(Course.class,id);
    }

    public void deleteById(Integer id)
    {
        Course course = findById(id);
        entityManager.remove(course);
    }

    public Course save(Course course)
    {
        if(course.getId() == null)
            entityManager.persist(course);
        else entityManager.merge(course);

        return course;
    }

    public void playWithEntityManager()
    {
        Course course = new Course("bio medical");
        entityManager.persist(course);
        entityManager.flush(); //----> is used to ensure that these changes are immediately written to the database.
        entityManager.detach(course);  // this will not update
//        entityManager.clear();  // it is also detach
        course.setName("bio medical updated");  // this will update because of @Transactional

//        entityManager.refresh(course); // it will reset to the old value
    }
}
