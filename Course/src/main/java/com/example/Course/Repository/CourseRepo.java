package com.example.Course.Repository;

import com.example.Course.Entity.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

    @Query("SELECT c FROM Course c WHERE c.name LIKE :name")
    public Course findByName(@Param("name") String name);


}
