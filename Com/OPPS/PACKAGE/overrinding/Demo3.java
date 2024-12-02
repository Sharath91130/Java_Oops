package Com.OPPS.PACKAGE.overrinding;

import Com.OPPS.PACKAGE.PACKAGE1.Demo1;
 class  Demo3 extends Demo2 {
    protected void  greet(){
        System.out.println("i overriding method");
    }

    @Override
    protected void show() {
        super.show();
        System.out.println("i default class but parent class is public class");
    }

     @Override
     public void helo() {
         System.out.println("hello");
     }
 }
