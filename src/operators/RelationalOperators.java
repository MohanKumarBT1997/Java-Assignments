package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println("Less than (<) Operator:");
        System.out.println("a < b: " + (a < b)); // true
        System.out.println("a < c: " + (a < c)); // false
        System.out.println("b < a: " + (b < a)); // false

        System.out.println("\nLess than or equal to (<=) Operator:");
        System.out.println("a <= b: " + (a <= b)); // true
        System.out.println("a <= c: " + (a <= c)); // true
        System.out.println("b <= a: " + (b <= a)); // false

        System.out.println("\nGreater than (>) Operator:");
        System.out.println("a > b: " + (a > b)); // false
        System.out.println("a > c: " + (a > c)); // false
        System.out.println("b > a: " + (b > a)); // true

        System.out.println("\nGreater than or equal to (>=) Operator:");
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a >= c: " + (a >= c)); // true
        System.out.println("b >= a: " + (b >= a)); // true
    }
}
