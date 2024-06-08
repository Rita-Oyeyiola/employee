package com.septa.employeemanagement.repository;

import com.septa.employeemanagement.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
