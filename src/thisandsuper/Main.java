package thisandsuper;

public class Main {
    public Main() {
        System.out.println("Main default constructor");
    }

    public Main(String name) {
        System.out.println("Main parameterized constructor: " + name);
    }
}

class Child extends Main {
    public Child() {
        super(); // Calls the default constructor of the parent class
        System.out.println("Child default constructor");
    }

    public Child(String name) {
        super(name); // Calls the parameterized constructor of the parent class
        System.out.println("Child parameterized constructor: " + name);
    }

    public static void main(String[] args) {
        Child myChild1 = new Child();
        Child myChild2 = new Child("John");
    }
}