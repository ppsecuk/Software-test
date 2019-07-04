package five;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class FunctionsUtilTest {

    private static List<Employee> employees;
    private static List<Animal> animals;

    @BeforeClass
    public static void setUp() throws Exception{
        Employee[] arrayOfEmps = {
                new Employee(1,"Emp One", 10.0, DepartmentType.IT),
                new Employee(2,"Emp Two", 20.0, DepartmentType.IT),
                new Employee(3,"Emp Three", 30.0, DepartmentType.IT),
                new Employee(4,"Emp Four", 40.0, DepartmentType.IT),
        };
        employees = new ArrayList<>(Arrays.asList(arrayOfEmps));

        animals = new ArrayList<>();
        animals.add(new Animal(1, "Cat"));
        animals.add(new Animal(2,"Dog"));
    }

    @Test
    public void testGetEmployeesBySalaryWith10ReturnHigherThan10(){
        List<Employee> expectedList = FunctionsUtil.getEmployeesBySalary(employees,10);
        assertEquals(expectedList.size(), 2);
    }

    @Test
    public void testGetEmployeesByDepartmentWithOneDeptReturnOne(){
        Map<DepartmentType, List<Employee>> departmentTypeListMap = FunctionsUtil.groupEmployeesByDepartment(employees);

        assertEquals(departmentTypeListMap.get(DepartmentType.IT).size(),4);
    }

    @Test
    public void testConvertAnimalListToMapWithTwoReturnTwo(){
        Map<Integer, Animal> animalMap = FunctionsUtil.convertAnimalListToMap(animals);
        assertEquals(animalMap.size(),2);
    }

    @AfterClass
    public static void tearDown(){
        employees.clear();
        animals.clear();
    }
}
