package interfaces;

interface MyInterface {
	void normalMethod();
	default void defaultMethod() {
		System.out.println("This is a default method");
	}
}

class MyClass implements MyInterface {
	public void normalMethod() {
		System.out.println("This is a normal method");
	}
}
public class InterfaceProgranSix {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.normalMethod(); 
		obj.defaultMethod(); 
	}
}