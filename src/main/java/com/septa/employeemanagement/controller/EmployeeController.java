package com.septa.employeemanagement.controller;

import com.septa.employeemanagement.model.Employee;
import com.septa.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @PostMapping
    public Employee createEmployee(Employee employee){
        return employeeService.createEmployee(employee);
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }
    @DeleteMapping
    public void deleteEmployee(Long id){
        employeeService.deleteEmployee(id);
    }

//    public List<Employee> searchEmployee(@RequestParam(required = false) Long departmentId, @RequestParam(required = false) Long roleId){
//        if (departmentId != null){
//            return (List<Employee>) employeeService.getEmployeeById(departmentId);
//        } else if (roleId != null) {
//           return employeeService.getAllEmployee(roleId);
//        }else {
//            return employeeService.getAllEmployee();
//        }
//    }

}
