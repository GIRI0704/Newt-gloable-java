package com.example.inheritanceHierarchies.Service;

import com.example.inheritanceHierarchies.Entity.Employee;
import com.example.inheritanceHierarchies.Entity.FullTimeEmployee;
import com.example.inheritanceHierarchies.Entity.PartTimeEmployee;
import com.example.inheritanceHierarchies.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee getEmp(Integer id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public FullTimeEmployee addFullTimeEmployee(String name, Integer salary) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setName(name);
        fullTimeEmployee.setSalary(salary);
        return employeeRepo.save(fullTimeEmployee);
    }

    public PartTimeEmployee addPartTimeEmployee(String name, Integer hourlyWage) {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.setName(name);
        partTimeEmployee.setHourlyWage(hourlyWage);
        return employeeRepo.save(partTimeEmployee);
    }
}
