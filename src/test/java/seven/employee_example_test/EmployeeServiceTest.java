package seven.employee_example_test;

import employee_example.Employee;
import employee_example.EmployeeDaoImp;
import employee_example.EmployeeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    private EmployeeDaoImp employeeDao;

    private EmployeeService employeeService;

    @Before
    public void setUp() throws Exception {
        employeeService = new EmployeeService();
        employeeDao = mock(EmployeeDaoImp.class);
        employeeService.setEmployeeDao(employeeDao);
    }

    @Test
    public void testAddValidatedEmployeeReturnsTrue(){
        boolean expected = true;
        Employee employee = new Employee("1", "John", "Doe");

        when(employeeDao.validate(employee)).thenReturn(true);
        boolean actual = employeeService.add(employee);

        verify(employeeDao.validate(employee));

        assertThat(actual, is(notNullValue()));
        assertEquals(expected, actual);
    }

    @Test
    public void testFindAllWithTwoEmployeesReturnsTwo(){
        Employee firstEmployee = new Employee("1", "Bob", "Willson");
        Employee secondEmployee = new Employee("2", "Bobby", "Willsons");
        List<Employee> expected = new ArrayList<>();
        expected.add(firstEmployee);
        expected.add(secondEmployee);
        when(employeeDao.findAll()).thenReturn(expected);

        List<Employee> actual = employeeService.findAll();
        verify(employeeDao).findAll();
        verify(employeeDao,times(0)).update(any(Employee.class));

        assertEquals(expected, actual);
        assertEquals("Bob",actual.get(0).getName());
    }

    @Test
    public void testFindAllWithEmptyReturnsZeroData(){
        List<Employee> expected = new ArrayList<>();
        when(employeeDao.findAll()).thenReturn(expected);
        List<Employee> actual = employeeService.findAll();
        verify(employeeDao).findAll();
        assertEquals(0,actual.size());
    }

    @Test
    public void testUpdateWithValidEmployeeReturnsEmployee(){
        Employee employee = new Employee("2", "Pavel", "Psecuk");
        when(employeeDao.validate(employee)).thenReturn(true);
        Employee actual = employeeService.update(employee);
        verify(employeeDao,times(1)).validate(employee);
        verify(employeeDao,atLeast(1)).validate(employee);
        verify(employeeDao,atMost(2)).validate(employee);
        assertEquals(employee, actual);
    }
}
