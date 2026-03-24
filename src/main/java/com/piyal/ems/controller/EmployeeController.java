package com.piyal.ems.controller;

import com.piyal.ems.dto.*;
import com.piyal.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public EmployeeResponseDTO create(@RequestBody EmployeeRequestDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<EmployeeResponseDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public EmployeeResponseDTO getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public EmployeeResponseDTO update(@PathVariable Long id, @RequestBody EmployeeRequestDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}