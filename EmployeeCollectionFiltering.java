import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    public String name;
    public String dept;
    public Double salary;

    Employee(String name, String dept, Double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + dept + ") - $" + salary;
    }
}

class EmployeeCollectionFiltering {
    public static void main(String[] args) {
        // 1. Fixed the syntax errors and initialized the LinkedList properly
        List<Employee> employeeList = new LinkedList<>(Arrays.asList(
            new Employee("Alice", "IT", 85000.0),
            new Employee("Bob", "HR", 50000.0),
            new Employee("Charlie", "IT", 95000.0),
            new Employee("David", "Finance", 70000.0),
            new Employee("Eve", "IT", 60000.0)
        ));

        // 2. Filter the employees (Example: Find IT department employees making over $70,000)
        List<Employee> filteredEmployees = employeeList.stream()
            .filter(emp -> "IT".equals(emp.dept))
            .filter(emp -> emp.salary > 70000.0)
            .collect(Collectors.toList());

        // 3. Print the results
        System.out.println("Filtered IT Employees with high salary:");
        filteredEmployees.forEach(System.out::println);
    }
}
