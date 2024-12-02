package InnerClass;

public class StudentApp {
    public static void main(String[] args) {
        student s=new student();
        Adress ad=new Adress();
        s.addr=ad;
        s.addr.city="bengaluru";
        s.addr.state="karnataka";
        System.out.println(s.addr.city+" "+s.addr.state);


    }
}
