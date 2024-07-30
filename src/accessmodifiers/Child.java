package accessmodifiers;

//Parent class with private fields and private method
class Parent {
	private int x;
	private String y;

	private void privateMethod() {
		System.out.println("This is a private method in Parent class");
	}

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.x = 10;
		parent.y = "Hello";

		System.out.println("In Parent class main method:");
		System.out.println("x = " + parent.x);
		System.out.println("y = " + parent.y);

		parent.privateMethod();
	}
}

//Subclass Child that extends Parent
public class Child extends Parent {
	public static void main(String[] args) {
		Child child = new Child();

		// Trying to access private fields and method from subclass
		// The following lines will result in compilation errors
		// System.out.println("In Child class main method:");
		// System.out.println("x = " + child.x);
		// System.out.println("y = " + child.y);
		// child.privateMethod();

		System.out.println("Private fields and method cannot be accessed from subclass");
	}
}
