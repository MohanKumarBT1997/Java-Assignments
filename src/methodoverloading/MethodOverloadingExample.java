package methodoverloading;

public class MethodOverloadingExample {
    public static void main(String[] args) {
        printNumbers(1, 2, 3);
        printNumbers(1, 2);
    }

    public static void printNumbers(int a, int b) {
        System.out.println("Printing two numbers: " + a + " and " + b);
    }

    public static void printNumbers(int a, int b, int c) {
        System.out.println("Printing three numbers: " + a + ", " + b + ", and " + c);
    }
}
