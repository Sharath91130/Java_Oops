package Polymorphism.Rules;

import java.sql.SQLOutput;

public class sample2 extends Sample{
//    int display(){
//        System.out.println("hello");
//
//        return 1;
//    }
    Demo1 display2(){
        Demo1 d2=new Demo1();
        System.out.println("sample2");
        System.out.println(d2);
        return d2;

    }
}
