package Polymorphism;

public class Forest {
    void accept(Animal animal){
        animal.eat();
        animal.sleep();
    }
}
