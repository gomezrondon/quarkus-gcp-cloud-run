package org.gomezrondon.service;

import org.gomezrondon.entitie.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findByLasName(String name);
}
