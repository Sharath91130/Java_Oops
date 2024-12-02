package Polymorphism;



public class BirdApps {
    public static void main(String[] args) {
        Bird bird=new eagle();
        bird.eat();
        bird.fly();
        ((eagle) bird).sleep();
        System.out.println();
        bird=new sparrow();
        bird.fly();
        bird.eat();

        System.out.println("my own code");
          new sparrow().eat();
          Bird b=new Bird();
          b.eat();
          b.fly();


    }
}
