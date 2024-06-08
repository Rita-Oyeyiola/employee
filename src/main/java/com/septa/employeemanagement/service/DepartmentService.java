package com.septa.employeemanagement.service;

import com.septa.employeemanagement.model.Department;
import com.septa.employeemanagement.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("department not found"));
    }
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }
    public Department updateDepartment(Long id, Department departmentDetails){
        Department department = getDepartmentById(id);
        department.setName(departmentDetails.getName());
        department.setId(departmentDetails.getId());
        return departmentRepository.save(department);
    }
    public void deleteDepartment(Long id){
        Department department = getDepartmentById(id);
        departmentRepository.delete(department);
    }


}
