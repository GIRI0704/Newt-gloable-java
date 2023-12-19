package com.example.inheritanceHierarchies.Entity;

import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FullTimeEmployee extends Employee {
    private Integer salary;
}
