package com.springbootsimple.springbootsimple.controller;

import com.springbootsimple.springbootsimple.entity.Department;
import com.springbootsimple.springbootsimple.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
       return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department>fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }
    @GetMapping("/department/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long id){
        return departmentService.fetchDepartmentById(id);
    }
    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long id){
        departmentService.deleteDepartmentById(id);
        return "Delete department successfully";
    }
    @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable("id") Long id, @RequestBody Department department ){
        return departmentService.updateDepartment(id, department);
    }

}
