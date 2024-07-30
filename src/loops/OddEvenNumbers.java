package loops;

public class OddEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2!= 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Even numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
