package Inheritance.MultliLevel;


    class Animal_with_constructor {
        Animal_with_constructor() {
            System.out.println("Animal constructor called");
        }
    }

    // Derived class (Level 2)
    class Mammal extends Animal_with_constructor {
        Mammal() {
            System.out.println("Mammal constructor called");
        }
    }

    // Derived class (Level 3)
    class Dog_Constructor extends Mammal {
        Dog_Constructor () {
            // first line will be call its parent constuctor
            System.out.println("Dog constructor called");
        }
    }

public class MultiLevel_WithConstructor {
        public static void main(String[] args) {
            // Creating an object of the Dog class
            Dog_Constructor  dog = new Dog_Constructor ();
        }
    }


