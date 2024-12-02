package SingleTon;

public class App {
    public static void main(String[] args) {
        Employee employee=Employee.getInstance();
        employee.work();
        employee.applyLeave();
        Employee employee1=Employee.getInstance();
        employee1.work();
        employee1.applyLeave();
    }
}
