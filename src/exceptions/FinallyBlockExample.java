package exceptions;

public class FinallyBlockExample {
    public static void main(String[] args) {
        System.out.println("Result: " + method());
    }

    public static int method() {
        try {
            System.out.println("Try block started");
            return 10;
        } finally {
            System.out.println("Finally block: Cleaning up resources");
        }
    }
}
