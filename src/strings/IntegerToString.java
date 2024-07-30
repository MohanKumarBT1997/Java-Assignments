package strings;

public class IntegerToString {
    public static void main(String[] args) {
        Integer intValue = 123;

        String str1 = intValue.toString();
        System.out.println("Using toString(): " + str1);

        String str2 = String.valueOf(intValue);
        System.out.println("Using String.valueOf(): " + str2);

        String str3 = "" + intValue;
        System.out.println("Using concatenation: " + str3);

        String str4 = String.format("%d", intValue);
        System.out.println("Using String.format(): " + str4);
    }
}
