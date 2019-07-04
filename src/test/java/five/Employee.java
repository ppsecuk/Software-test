package five;

public class Employee {

    private int id;
    private String name;
    private Double salary;
    private DepartmentType departmentType;

    public Employee(int id, String name, Double salary, DepartmentType departmentType) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentType = departmentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }
}
