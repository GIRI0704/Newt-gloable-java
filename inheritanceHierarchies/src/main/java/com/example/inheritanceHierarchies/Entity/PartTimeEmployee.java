package com.example.inheritanceHierarchies.Entity;

import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PartTimeEmployee extends Employee{
    private Integer hourlyWage;
}
