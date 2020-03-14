package org.gomezrondon.controller;


import org.gomezrondon.entitie.Employee;
import org.gomezrondon.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class EndpointController {

    private final EmployeeService service;

    public EndpointController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/time")
    public String forTesting() {
        Employee employee = new Employee("javier", "gomez");
        String time = LocalDateTime.now().toString();
        return time;
    }

    @GetMapping("/employees/lastname/{name}")
    public List<Employee> findByLastName(@PathVariable String name){
        List<Employee> list = service.findByLasName(name);
        return list;
    }

/*    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        List<Employee> list = service.getAllEmployees();
        return list;
    }



    @PutMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        Employee save = service.save(new Employee(employee.getFirstName(),employee.getLastName()));
        return save;
    }*/




}
