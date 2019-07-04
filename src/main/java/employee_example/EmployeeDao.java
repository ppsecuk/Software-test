package employee_example;

import employee_example.Employee;

import java.util.List;

public interface EmployeeDao {

    boolean add(Employee employee);

    boolean validate(Employee employee);

    List<Employee> findAll();

    Employee update(Employee employee);

}
