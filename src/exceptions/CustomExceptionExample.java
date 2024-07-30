package exceptions;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("You are not eligible to vote");
        }
        System.out.println("You are eligible to vote.");
    }
}
