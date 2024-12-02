package Upcasting;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
    static int a=50;


}

class Dog extends Animal {
   static  int a=10;
    public void sound()
    {
//        super.sound();
//        this.play();

        System.out.println("Dog barks");
        //System.out.println(a);
//       int ans= super.a+this.a;
//        System.out.println(ans);
    }
    
    public void play() {
        System.out.println("Dog is playing");
    }

}

public class UpcastingExample {
    public static void main(String[] args) {
        Dog dog = new Dog();  // Creating a Dog object
        Animal animal = dog;  // Upcasting: Dog is being referred to as an Animal

        // animal.sound();
        Animal a = new Dog();
        a.sound();
//        Animal a1 = new Animal();
//       // a1.sound();
//        Dog d = (Dog) a;
//        d.play();
        //System.out.println(a.a);
        Dog d1=new Dog();
        System.out.println(d1.a);





    }
}
