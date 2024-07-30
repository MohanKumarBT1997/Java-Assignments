package exceptions;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
