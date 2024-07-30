package abstractclass;

// Abstract class with abstract and non-abstract methods
abstract class Shape {
    // Non-abstract method
    public void display() {
        System.out.println("This is a shape");
    }

    // Abstract method
    public abstract void draw();

    // Abstract method
    public abstract void area();
}

// Subclass Circle for the abstract class Shape
public class Circle extends Shape {
    // Override the abstract draw method
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Override the abstract area method
    @Override
    public void area() {
        System.out.println("Calculating the area of a circle");
    }

    public static void main(String[] args) {
        // Create an object in the child class for the abstract class
        Shape shape = new Circle();

        // Access the non-abstract methods
        shape.display();

        // Create an instance for the child class in child class and call abstract methods
        Circle circle = new Circle();
        circle.draw();
        circle.area();

        // Create an instance for the child class in child class and call non-abstract methods
        Circle anotherCircle = new Circle();
        anotherCircle.display();
    }
}