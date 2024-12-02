package Polymorphism;

public class AnimalApps {
    public static void main(String[] args) {
        Forest forest=new Forest();
        forest.accept(new Lion());
        System.out.println();
        forest.accept(new deer());
        System.out.println();
        forest.accept(new tiger());
        System.out.println();
        forest.accept(new Monkey());
    }
}
