package five;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionsUtil {

    public static List<Employee> getEmployeesBySalary(List<Employee> employeeList, double salary){
        return employeeList.stream()
                .filter(e -> e != null)
                .filter(e -> e.getSalary() > salary)
                .collect(Collectors.toList());
    }

    public static Map<DepartmentType, List<Employee>> groupEmployeesByDepartment
            (List<Employee> employeeList){
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentType));
    }

    public static Map<Integer, Animal> convertAnimalListToMap(List<Animal> list){
        Map<Integer, Animal> map = list.stream()
                .collect(Collectors.toMap(Animal::getId, animal -> animal));
        return map;
    }
}
