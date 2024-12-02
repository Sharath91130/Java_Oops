package CopyConstructor;

class Student {
    private String name;
    private int age;

    // Constructor to initialize the object
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student("John", 21);

        // Creating a copy of student1 using the copy constructor
        Student student3 = new Student(student1);
        student1=new Student("Sharat",23);
       Student student2 = new Student(student1);
        student1=new Student("mani",22);


        // Displaying the values
        System.out.println("Student1: " + student1.getName() + ", " + student1.getAge());
        System.out.println("Student2: " + student2.getName() + ", " + student2.getAge());
    }
}
