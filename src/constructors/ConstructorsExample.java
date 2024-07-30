package constructors;

//Super class with default, one-arg, and two-arg constructors
class SuperClass {
 public SuperClass() {
     System.out.println("SuperClass default constructor called");
 }

 public SuperClass(int x) {
     System.out.println("SuperClass one-arg constructor called with x = " + x);
 }

 public SuperClass(int x, String s) {
     System.out.println("SuperClass two-arg constructor called with x = " + x + " and s = " + s);
 }
}

//Child class that calls super class constructors
class ChildClass extends SuperClass {
 public ChildClass() {
     super(); // calls SuperClass default constructor
     System.out.println("ChildClass default constructor called");
 }

 public ChildClass(int x) {
     super(x); // calls SuperClass one-arg constructor
     System.out.println("ChildClass one-arg constructor called with x = " + x);
 }

 public ChildClass(int x, String s) {
     super(x, s); // calls SuperClass two-arg constructor
     System.out.println("ChildClass two-arg constructor called with x = " + x + " and s = " + s);
 }
}

//Class with private, public, protected, and default access modifiers
class AccessModifiers {
 private AccessModifiers() {
     System.out.println("Private constructor called");
 }

 public AccessModifiers(int x) {
     System.out.println("Public constructor called with x = " + x);
 }

 protected AccessModifiers(String s) {
     System.out.println("Protected constructor called with s = " + s);
 }

 AccessModifiers(boolean b) {
     System.out.println("Default constructor called with b = " + b);
 }
}

//Class with constructors that return int and String (not possible in Java)
//Constructors do not have return types in Java
//class ReturnType {
//  public int ReturnType() {
//      return 10;
//  }
//
//  public String ReturnType(String s) {
//      return s;
//  }
//}

public class ConstructorsExample {
 public static void main(String[] args) {
     // Instantiate SuperClass and call all constructors
     SuperClass obj1 = new SuperClass();
     SuperClass obj2 = new SuperClass(10);
     SuperClass obj3 = new SuperClass(10, "Hello");

     // Instantiate ChildClass and call all constructors
     ChildClass child1 = new ChildClass();
     ChildClass child2 = new ChildClass(20);
     ChildClass child3 = new ChildClass(20, "World");

     // Instantiate AccessModifiers and call constructors with different access modifiers
     AccessModifiers am1 = new AccessModifiers(30); 
     // public constructor
     // AccessModifiers am2 = new AccessModifiers("Hello"); 
     // protected constructor, cannot be accessed from outside the class
     // AccessModifiers am3 = new AccessModifiers(); 
     // private constructor, cannot be accessed from outside the class
     AccessModifiers am4 = new AccessModifiers(true); // default constructor

     // Try to call the constructor multiple times with the same object
     // Not possible in Java, constructors can only be called once when an object is created
     // SuperClass obj4 = new SuperClass();
     // obj4 = new SuperClass(40); // cannot call constructor again on the same object
 }
}