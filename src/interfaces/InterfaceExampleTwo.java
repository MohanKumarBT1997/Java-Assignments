package interfaces;

interface A {
    void method1();
    void method2();
}

class B implements A {
    @Override
    public void method1() {
        System.out.println("Method 1 implemented");
    }

	@Override
	public void method2() {
		System.out.println("Method 2 implemented");		
	}
}

public class InterfaceExampleTwo {
    public static void main(String[] args) {
        B b = new B();
        b.method1();
        b.method2();
    }
}
