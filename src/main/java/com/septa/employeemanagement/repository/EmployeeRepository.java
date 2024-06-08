package com.septa.employeemanagement.repository;

import com.septa.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartmentbyId(Long departmentId);
    List<Employee> findByRoleId(Long roleId);
}
