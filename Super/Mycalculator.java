package Super;

import java.util.Scanner;

public class Mycalculator  extends calculator {
    String name = "epson";
    Scanner sc = new Scanner(System.in);

    void addition() {
       // this.name = "hello";
        super.addition();
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("addition result " + (a + b));
    }

    void display() {
//    this();
//    super();
        super.addition();
        System.out.println(name);
        System.out.println(super.name);
    }

//    public Mycalculator() {
//        super.name = "hello";
//        super.addition();
//    }
}
