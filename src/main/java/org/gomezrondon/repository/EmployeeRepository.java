package org.gomezrondon.repository;

import org.gomezrondon.entitie.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query(value="from Employee e where e.lastName = ?1")
    List<Employee> findByLastName(String lastName);

    // List<Employee> findAllByFirstName(String firstName); // no funciona

}
