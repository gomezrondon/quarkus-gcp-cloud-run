package org.gomezrondon;

import org.gomezrondon.entitie.Employee;
import org.gomezrondon.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/hello")
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

/*    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/employee")
    public List<Employee> getEmpleado() {
        List<Employee> javier = repository.findAllByFirstName("javier");

        return javier;
    }*/
}