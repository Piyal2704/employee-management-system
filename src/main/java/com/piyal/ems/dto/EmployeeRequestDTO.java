package com.piyal.ems.dto;

import lombok.Data;

@Data
public class EmployeeRequestDTO {
    private String name;
    private String email;
    private String department;
    private double salary;
}