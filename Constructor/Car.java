package Constructor;

public class Car {
    String name;
    String color;
    int cost;
    public Car(String name,String color,int cost){
        this.name=name;
        this.color=color;
        this.cost=cost;
    }
    void display() {
        System.out.println("Car name: " +" "+name);;
        System.out.println("color: "+" " + color);
        System.out.println("cost: " +" "+cost);
    }
}
