package exceptions;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[5] = 10; 
            String str = null;
            str.length(); 
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
            System.out.println("Exception message: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot call methods on a null object!");
            System.out.println("Exception message: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            System.out.println("Exception message: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred!");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
