package com.example.inheritanceHierarchies.Controller;

import ch.qos.logback.core.model.INamedModel;
import com.example.inheritanceHierarchies.Entity.Employee;
import com.example.inheritanceHierarchies.Entity.FullTimeEmployee;
import com.example.inheritanceHierarchies.Entity.PartTimeEmployee;
import com.example.inheritanceHierarchies.Repository.EmployeeRepo;
import com.example.inheritanceHierarchies.Service.EmployeeService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("getEmp")
    public Employee getEmp(@RequestParam("id") Integer id)
    {
        return employeeService.getEmp(id);
    }

    @PostMapping("/full-time")
    public FullTimeEmployee addFullTimeEmployee(@RequestParam("name") String name,@RequestParam("salary") Integer salary) {
        return employeeService.addFullTimeEmployee(name,salary);
    }

    @PostMapping("/part-time")
    public PartTimeEmployee addPartTimeEmployee(@RequestParam("name") String name,@RequestParam("salary") Integer hourlyWage) {
        return employeeService.addPartTimeEmployee(name,hourlyWage);
    }


}
