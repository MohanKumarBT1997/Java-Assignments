package exceptions;

public class ExceptionExample {
    public static void divideByZero() throws ArithmeticException {
        int num1 = 10;
        int num2 = 0;
        int result = num1 / num2; 
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        divideByZero(); 
    }
}
