package SingleTon;

public class Student {
    String name;
    int age;
    public Student(String name ,int age) {
        this.age=age;
        this.name=name;

    }
    public void details(){
        System.out.println(name+" "+" Student is studying ");
    }



}

class StudentAp{
    public static void main(String[] args) {
        Student s1=new Student("Sharatg", 22);
        System.out.println(s1);
        s1.details();

        Student s2=new Student("Mani", 22);
        System.out.println(s2);
        s2.details();

        Student s3=s2;
        System.out.println(s3);
        s3.details();



    }
}
