package abstractclass;

abstract class Shape {
    public void display() {
        System.out.println("This is a shape");
    }

    public abstract void draw();

    public abstract void area();
}

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void area() {
        System.out.println("Calculating the area of a circle");
    }

    public static void main(String[] args) {
        Shape shape = new Circle();

        shape.display();

        Circle circle = new Circle();
        circle.draw();
        circle.area();

        Circle anotherCircle = new Circle();
        anotherCircle.display();
    }
}