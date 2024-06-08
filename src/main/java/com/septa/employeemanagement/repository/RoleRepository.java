package com.septa.employeemanagement.repository;

import com.septa.employeemanagement.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
