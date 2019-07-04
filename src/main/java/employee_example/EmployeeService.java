package employee_example;

import employee_example.Employee;
import employee_example.EmployeeDao;
import employee_example.EmployeeDaoImp;

import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao;

    public boolean add(Employee employee){
        if(employeeDao.validate(employee)){
            return true;
        }
        return false;
    }
    public void setEmployeeDao(EmployeeDaoImp employeeDao){
        this.employeeDao = employeeDao;
    }
    public List<Employee> findAll(){
        return  employeeDao.findAll();
    }
    public Employee update(Employee employee){
        if(employeeDao.validate(employee)){
            return employee;
        }
        throw new RuntimeException("Validation failed");
    }
}
