package loops;

import java.util.Scanner;

public class PrintGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().charAt(0);
        scanner.close();

        switch (Character.toUpperCase(gender)) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid input. Please enter M or F.");
                break;
        }
    }
}
