package org.gomezrondon.service;

import org.gomezrondon.entitie.Employee;
import org.gomezrondon.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImp implements  EmployeeService{

    private final EmployeeRepository repository;

    public EmployeeServiceImp(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees() {
        return (List<Employee>) repository.findAll();
    }

    public Employee save(Employee employee){
        Employee save = repository.save(employee);

        return save;
    }

    public List<Employee> findByLasName(String name) {
        List<Employee> empl = repository.findByLastName(name);
        return empl ;
    }

}
