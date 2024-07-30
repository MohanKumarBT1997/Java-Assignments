package thisandsuper;

public class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void printDetails() {
        System.out.println("Brand: " + this.brand); // Accessing current class field using this
        System.out.println("Model: " + this.model); // Accessing current class field using this
    }

    public static class ElectricVehicle extends Vehicle {
        private int batteryCapacity;

        public ElectricVehicle(String brand, String model, int batteryCapacity) {
            super(brand, model); // Calls the parent class constructor
            this.batteryCapacity = batteryCapacity;
        }

        public void printDetails() {
            super.printDetails(); // Calls the parent class method
            System.out.println("Battery Capacity: " + this.batteryCapacity); // Accessing current class field using this
            System.out.println("Brand (using super): " + super.brand); // Accessing parent class field using super
            System.out.println("Model (using super): " + super.model); // Accessing parent class field using super
        }

        public static void main(String[] args) {
            ElectricVehicle myEV = new ElectricVehicle("Tesla", "Model S", 100);
            myEV.printDetails();
        }
    }
}
