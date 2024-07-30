package thisandsuper;

public class MyClass {
    public MyClass() {
        this("Default"); // Calls the current class constructor with a default value
        System.out.println("Default constructor");
    }

    public MyClass(String name) {
        System.out.println("Parameterized constructor: " + name);
    }

    public MyClass(String name, int age) {
        this(name); // Calls the current class constructor with a single argument
        System.out.println("Parameterized constructor with age: " + age);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass("John", 30);
    }
}
