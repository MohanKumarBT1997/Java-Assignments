package exceptions;

public class StringIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        String str = "hello";
        char c = str.charAt(10); 
        System.out.println("Character at index 10: " + c);
    }
}
