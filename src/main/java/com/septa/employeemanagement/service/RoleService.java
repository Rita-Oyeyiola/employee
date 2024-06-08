package com.septa.employeemanagement.service;

import com.septa.employeemanagement.model.Role;
import com.septa.employeemanagement.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public List<Role> getAllRole(){
        return roleRepository.findAll();
    }
    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElseThrow(() -> new RuntimeException("role not found"));
    }
    public Role createRole(Role role){
        return roleRepository.save(role);
    }
    public Role updateRole(Long id, Role roleDetails){
        Role role = getRoleById(id);
        role.setId(roleDetails.getId());
        role.setName(roleDetails.getName());
        return roleRepository.save(role);
    }
    public void deleteRole(Long id){
        Role role = getRoleById(id);
        roleRepository.delete(role);
    }
}

