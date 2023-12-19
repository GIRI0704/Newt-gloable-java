package com.example.inheritanceHierarchies.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  it is used to create a seperate table uncomment this
//and comment the 11 line
@DiscriminatorColumn(name = "employee_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

}
