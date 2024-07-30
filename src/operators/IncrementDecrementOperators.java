package operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int num = 10;

        System.out.println("Original value: " + num);

        System.out.println("Post-increment: " + (num++));
        System.out.println("Current value: " + num);

        System.out.println("Pre-increment: " + (++num));
        System.out.println("Current value: " + num);

        System.out.println("Post-decrement: " + (num--));
        System.out.println("Current value: " + num);

        System.out.println("Pre-decrement: " + (--num));
        System.out.println("Current value: " + num);
    }
}
