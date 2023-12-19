package com.example.inheritanceHierarchies.Repository;

import com.example.inheritanceHierarchies.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    Employee findByName(String name);
}
