package org.gomezrondon.repository;

import org.gomezrondon.entitie.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

/*    List<Employee> findAllByFirstName(String firstName);
    List<Employee> findAllByLastName(String lastName);*/
}
