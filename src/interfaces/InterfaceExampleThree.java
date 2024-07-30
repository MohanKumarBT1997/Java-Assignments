package interfaces;

interface Car {
    void drive();
}

class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a Toyota...");
    }
}

public class InterfaceExampleThree {
    public static void main(String[] args) {
        Car myCar = new Toyota();
        myCar.drive();
    }
}
