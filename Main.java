class Parent {
    // Static method in the parent class
    static void display() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    // Static method in the child class (method hiding)
    static void display() {
        System.out.println("Static method in Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        // Calling method using Parent class reference
//        Parent.display(); // Output: Static method in Parent class
//
//        // Calling method using Child class reference
//        Child.display(); // Output: Static method in Child class
        Parent p=new Child();
        p.display();
    }
}
