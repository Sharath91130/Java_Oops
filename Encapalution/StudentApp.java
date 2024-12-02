package Encapalution;

public class StudentApp {
    public static void main(String[] args) {
        Student student=new Student();
        student.eat();
        student.sleep();
        student.study();
        student.setAge(20);
        student.setGender("male");
        student.setName("sharath");
        student.displayDetails();
    }
}
