package org.example.springdatatest.Service;


import org.example.springdatatest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllemployees();

    public Employee addEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);
}
