package com.example.Course;

import com.example.Course.Entity.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CourseApplication.class)
class CourseApplicationTests {

	private Logger logger = Logger.getLogger(this.getClass().getName());

	@Autowired
	EntityManager entityManager;

	@Test
	void contextLoads() {
		// Your context load test logic
	}

	@Test
	public void criteriaQuery() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Course> cq = cb.createQuery(Course.class);

		Root<Course> courseRoot = cq.from(Course.class);

		TypedQuery<Course> query = entityManager.createQuery(cq.select(courseRoot));
		List<Course> list = query.getResultList();

		logger.log(Level.INFO, "Typed query results:\n{0}", list);
	}


}
