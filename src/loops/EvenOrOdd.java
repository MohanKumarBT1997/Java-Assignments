package loops;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int remainder = num % 2;

        switch (remainder) {
            case 0:
                System.out.println(num + " is even.");
                break;
            case 1:
                System.out.println(num + " is odd.");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }
}
