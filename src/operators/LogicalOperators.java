package operators;

public class LogicalOperators {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = true;
		boolean c = false;

		System.out.println("Logical AND (&&) Operator:");
		System.out.println("a && b: " + (a && b)); // true
		System.out.println("a && c: " + (a && c)); // false
		System.out.println("b && c: " + (b && c)); // false

		System.out.println("\nLogical OR (||) Operator:");
		System.out.println("a || b: " + (a || b)); // true
		System.out.println("a || c: " + (a || c)); // true
		System.out.println("b || c: " + (b || c)); // true

		System.out.println("\nLogical NOT (!) Operator:");
		System.out.println("!a: " + !a); // false
		System.out.println("!b: " + !b); // false
		System.out.println("!c: " + !c); // true

	}
}
