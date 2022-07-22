package com.springbootsimple.springbootsimple.service;

import com.springbootsimple.springbootsimple.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long id);


    public void deleteDepartmentById(Long id);

    public Department updateDepartment(Long id, Department department);
}
