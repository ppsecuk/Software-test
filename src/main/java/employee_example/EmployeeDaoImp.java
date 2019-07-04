package employee_example;

import employee_example.Employee;
import employee_example.EmployeeDao;

import java.util.Collections;
import java.util.List;

public class EmployeeDaoImp implements EmployeeDao {

    @Override
    public boolean add(Employee employee) {
        return true;
    }

    @Override
    public boolean validate(Employee employee) {
        throw new RuntimeException("Not implemented...");
    }

    @Override
    public List<Employee> findAll() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Employee update(Employee employee) {
        return employee;
    }

}
