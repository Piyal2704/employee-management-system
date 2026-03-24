package com.piyal.ems.service;

import com.piyal.ems.dto.*;
import com.piyal.ems.entity.Employee;
import com.piyal.ems.repository.EmployeeRepository;
import com.piyal.ems.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public EmployeeResponseDTO create(EmployeeRequestDTO dto) {
        return MapperUtil.toDTO(repo.save(MapperUtil.toEntity(dto)));
    }

    public List<EmployeeResponseDTO> getAll() {
        return repo.findAll().stream().map(MapperUtil::toDTO).collect(Collectors.toList());
    }

    public EmployeeResponseDTO getById(Long id) {
        return MapperUtil.toDTO(repo.findById(id).orElseThrow());
    }

    public EmployeeResponseDTO update(Long id, EmployeeRequestDTO dto) {
        Employee e = repo.findById(id).orElseThrow();
        e.setName(dto.getName());
        e.setEmail(dto.getEmail());
        e.setDepartment(dto.getDepartment());
        e.setSalary(dto.getSalary());
        return MapperUtil.toDTO(repo.save(e));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}