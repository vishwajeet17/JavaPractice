import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStreamExample {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = Arrays.asList(
                new Employee("John", 25, 50000),
                new Employee("Alice", 30, 60000),
                new Employee("Bob", 35, 70000),
                new Employee("Daisy", 28, 65000),
                new Employee("Charlie", 22, 45000)
        );

        // 1. Filter: Get all employees with salary greater than 55000
        List<Employee> highEarners = employees.stream()
                .filter(e -> e.getSalary() > 55000)
                .collect(Collectors.toList());
        System.out.println("Employees with salary > 55000: " + highEarners);

        // 2. Map: Get the names of all employees
        List<String> employeeNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("Employee Names: " + employeeNames);

        // 3. Sorted: Sort employees by age
        List<Employee> sortedByAge = employees.stream()
                .sorted((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()))
                .collect(Collectors.toList());
        System.out.println("Employees sorted by age: " + sortedByAge);

        // 4. Reduce: Get the total salary of all employees
        double totalSalary = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println("Total Salary: " + totalSalary);

        // 5. FindFirst: Find the first employee with age greater than 30
        Optional<Employee> firstOlderThan30 = employees.stream()
                .filter(e -> e.getAge() > 30)
                .findFirst();
        firstOlderThan30.ifPresent(employee -> 
                System.out.println("First employee older than 30: " + employee));

        // 6. Count: Count the number of employees younger than 30
        long countYoungerThan30 = employees.stream()
                .filter(e -> e.getAge() < 30)
                .count();
        System.out.println("Number of employees younger than 30: " + countYoungerThan30);

        // 7. Collectors.groupingBy: Group employees by age
        var employeesByAge = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge));
        System.out.println("Employees grouped by age: " + employeesByAge);
    }
}
