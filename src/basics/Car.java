package basics;

public class Car {
	public void startEngine() {
		System.out.println("The engine is started.");
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.startEngine();
	}
}
