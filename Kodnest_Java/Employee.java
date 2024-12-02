package Kodnest_Java;

// Employee class demonstrating encapsulation
public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        setSalary(salary);
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary must be non-negative.");
        }
    }
}
class s {

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John Doe", 50000);
        System.out.println("Employee ID: " + emp1.getEmployeeId());
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Employee Salary: " + emp1.getSalary());

        emp1.setName("John Smith");
        System.out.println("Updated Employee Name: " + emp1.getName());

        emp1.setSalary(60000);
        System.out.println("Updated Employee Salary: " + emp1.getSalary());

        emp1.setSalary(-1000); // This will print an error message
        System.out.println("Final Employee Salary: " + emp1.getSalary());
    }
}

