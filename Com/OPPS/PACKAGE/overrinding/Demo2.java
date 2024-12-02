package Com.OPPS.PACKAGE.overrinding;

public abstract class Demo2 {
    protected void greet(){
        System.out.println("hello i am greet method with default class and void return return type");
   }
    Demo display(){
        System.out.println("i am the Parent class and class  method");
        return new Demo();
    }
   protected void show(){
        System.out.println("hello i am from public class");
    }
    public abstract void helo();

    }

