package org.example.springdatatest.controller;

import org.example.springdatatest.Service.EmployeeService;
import org.example.springdatatest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class myRESTcontroller {
    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> showAllEmployee() {
        return service.getAllemployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = service.getEmployee(id);
        return employee;
    }

    // GET api/employees/3
    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);

    }

    @PutMapping("/employees")
    public Employee updateNewEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);

    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee employee = service.getEmployee(id);
        service.deleteEmployee(id);
        return "Employee with id=" + id + "was deleted";
    }
}