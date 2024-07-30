package methodoverloading;

public class MethodOverloadingExampleTwo {
    public static void main(String[] args) {
        printData(10); 
        printData("Hello", 20.5); 
    }

    public static void printData(int num) {
        System.out.println("Printing integer: " + num);
    }

    public static void printData(String str, double dec) {
        System.out.println("Printing string and double: " + str + " and " + dec);
    }
}
