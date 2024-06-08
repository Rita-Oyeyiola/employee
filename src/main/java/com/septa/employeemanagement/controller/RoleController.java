package com.septa.employeemanagement.controller;

import com.septa.employeemanagement.model.Role;
import com.septa.employeemanagement.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequestMapping
    public List<Role> getAllRole(){
        return roleService.getAllRole();
    }
    @PostMapping
    public Role createRole(Role role){
        return roleService.createRole(role);
    }
    @GetMapping("/{id}")
    public Role getRoleById(Long id){
        return roleService.getRoleById(id);
    }
    @PutMapping
    public Role updateRole(@PathVariable Long id, @RequestBody Role role){
        return roleService.updateRole(id, role);
    }
    public void DeleteRole(Long id){
        roleService.deleteRole(id);
    }


}
