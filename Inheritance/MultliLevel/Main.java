package Inheritance.MultliLevel;

// Superclass (Parent class)
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (Intermediate class)
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }

    @Override
    public void eat() {
        System.out.println("Dog Eating Chicken");
    }
}

// Subclass (Child class)
class BabyDog extends Dog {
    public void weep() {
        System.out.println("The baby dog weeps.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the subclass BabyDog
//        BabyDog babyDog = new BabyDog();
//
//        // Access methods from Animal class (grandparent)
//        babyDog.eat();  // Inherited from Animal class
//
//        // Access method from Dog class (parent)
//        babyDog.bark(); // Inherited from Dog class
//
//        // Access method from BabyDog class (itself)
//        babyDog.weep(); // Defined in BabyDog class
//        Animal a=new Dog();
//        a.eat();
//        Dog b=(Dog) a;
//        b.bark();
        Animal animal=new BabyDog();
        Dog d=new BabyDog();

    }
}
