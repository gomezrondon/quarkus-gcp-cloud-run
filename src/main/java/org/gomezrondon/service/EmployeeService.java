package org.gomezrondon.service;

import org.gomezrondon.entitie.Employee;

import java.util.List;

public interface EmployeeService {
     List<Employee> findByLasName(String name);
     Employee save(Employee employee);
     List<Employee> getAllEmployees();

}
