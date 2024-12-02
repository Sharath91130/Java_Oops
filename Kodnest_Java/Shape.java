package Kodnest_Java;
class Shape {
    public Shape draw() {
        System.out.println("Drawing a shape");
        return this;
    }
}

class Circle extends Shape {
    public Circle draw() {
        System.out.println("Drawing a circle");
        return this;
    }
}

class Rectangle extends Shape {
    public Rectangle draw() {
        System.out.println("Drawing a rectangle");
        return this;
    }

//}
//public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape();
        Shape drawnShape = shape.draw();
        System.out.println("Drawn shape type: " + drawnShape.getClass().getSimpleName());

        Circle circle = new Circle();
        Circle drawnCircle = circle.draw();
        System.out.println("Drawn circle type: " + drawnCircle.getClass().getSimpleName());

        Rectangle rectangle = new Rectangle();
        Rectangle drawnRectangle = rectangle.draw();
        System.out.println("Drawn rectangle type: " + drawnRectangle.getClass().getSimpleName());
    }
}

