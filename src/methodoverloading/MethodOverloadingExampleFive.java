package methodoverloading;

public class MethodOverloadingExampleFive {
	
    public static void main(String[] args) {
        int result1 = add(10, 20); 
        double result2 = add(10.5, 20.5); 
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
