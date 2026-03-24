package com.piyal.ems.service;

import com.piyal.ems.dto.*;
import java.util.List;

public interface EmployeeService {

    EmployeeResponseDTO create(EmployeeRequestDTO dto);

    List<EmployeeResponseDTO> getAll();

    EmployeeResponseDTO getById(Long id);

    EmployeeResponseDTO update(Long id, EmployeeRequestDTO dto);

    void delete(Long id);
}