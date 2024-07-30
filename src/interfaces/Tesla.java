package interfaces;

 interface Vehicle {
 void startEngine();
}

 interface ElectricVehicle extends Vehicle {
 void chargeBattery();
}

public class Tesla implements ElectricVehicle {
	
 @Override
 public void startEngine() {
     System.out.println("Starting electric motor...");
 }

 @Override
 public void chargeBattery() {
     System.out.println("Charging battery...");
 }

 public static void main(String[] args) {
     Tesla tesla = new Tesla();
     tesla.startEngine(); 
     tesla.chargeBattery(); 
 }
}
