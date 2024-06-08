package com.septa.employeemanagement.controller;

import com.septa.employeemanagement.model.Department;
import com.septa.employeemanagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }
    @PostMapping
    public Department createDepartment(Department department){
        return departmentService.createDepartment(department);
    }
    @GetMapping("/{id}")
    public Department getDepartmentById(Long id){
        return departmentService.getDepartmentById(id);
    }
    @PutMapping
    public Department updateDepartment(@PathVariable Long id, @RequestParam Department department){
        return departmentService.updateDepartment(id, department);
    }
    @DeleteMapping
    public void  deleteDepartment(Long id){
        departmentService.deleteDepartment(id);
    }



}
