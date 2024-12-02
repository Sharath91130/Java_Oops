package HAS_A_RELATION;

public class StudentApp {
    public static void main(String[] args) {
        Stduent student = new Stduent();

        System.out.println("Student Brain details");
        System.out.println(student.brain.colorl);
        System.out.println(student.brain.weight);
        student.StudyHelp(student.brain);
        System.out.println();

//        System.out.println("student Detaisl about heeart");
//        System.out.println(student.heart.color);
//        System.out.println(student.heart.weight);
//        student.heart.pumpBlood();

        System.out.println("car details");
        Car car=new Car();

        student.StudentCarDetaisl(car);

        System.out.println("book");
        book b=new book();
        student.bookDetails(b);


        System.out.println("after death student");
       // student=null;
        //System.out.println(student.brain.colorl);
        System.out.println(car.brand);
        //student.StudentCarDetaisl(car);
        car.Drive();


        //System.out.println("details about human book details");
        Human human=new Human();
        human.bookDetails(b);


        System.out.println("details about Human hearts");
        System.out.println(human.h.color);
        human.h.pumpBlood();


        System.out.println("student detaisl;");
        student.StudentHeightAndWeight();


        // accesing the student details via human
        Human h1=new Stduent();
        



    }

}
