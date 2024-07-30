package loops;

public class EqualityOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int z = 10;

        System.out.println("x == y: " + (x == y)); // true
        System.out.println("x == z: " + (x == z)); // false

        System.out.println("x != y: " + (x != y)); // false
        System.out.println("x != z: " + (x != z)); // true
    }
}
