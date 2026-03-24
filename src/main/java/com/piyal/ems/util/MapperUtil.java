package com.piyal.ems.util;

import com.piyal.ems.dto.*;
import com.piyal.ems.entity.Employee;

public class MapperUtil {

    public static Employee toEntity(EmployeeRequestDTO dto) {
        Employee e = new Employee();
        e.setName(dto.getName());
        e.setEmail(dto.getEmail());
        e.setDepartment(dto.getDepartment());
        e.setSalary(dto.getSalary());
        return e;
    }

    public static EmployeeResponseDTO toDTO(Employee e) {
        EmployeeResponseDTO dto = new EmployeeResponseDTO();
        dto.setId(e.getId());
        dto.setName(e.getName());
        dto.setEmail(e.getEmail());
        dto.setDepartment(e.getDepartment());
        dto.setSalary(e.getSalary());
        return dto;
    }
}