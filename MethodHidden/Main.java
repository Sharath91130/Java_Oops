package MethodHidden;

class SuperClass {
    // Static method in the superclass
     void display() {
        System.out.println("Static method in SuperClass");
    }

    // Non-static method in the superclass
    void show() {
        System.out.println("Instance method in SuperClass");
    }
}

class SubClass extends SuperClass {
    // Static method in the subclass, hiding the superclass method
     void display() {
        System.out.println("Static method in SubClass");
    }

    // Non-static method in the subclass, overriding the superclass method
    @Override
    void show() {
        System.out.println("Instance method in SubClass");
    }
    void downcasting(){
        System.out.println("downcasting");
    }
}

public class Main {
    public static void main(String[] args) {
//        SuperClass sc=new SuperClass();
//        sc.show();
//        SuperClass superClass = new SuperClass();
//        superClass.display();
//        superClass.show();
        SuperClass subClass = new SubClass();
        subClass.display();   // Calls SuperClass's static method (method hiding)
        subClass.show();

        SuperClass sc =new SubClass();
        sc.show();

        SubClass subClass1= (SubClass) subClass;
        subClass1.downcasting();

    }
}
