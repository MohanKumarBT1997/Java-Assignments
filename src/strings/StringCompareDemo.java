package strings;

public class StringCompareDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        if (str1.equals(str3)) {
            System.out.println("str1 and str3 are equal");
        } else {
            System.out.println("str1 and str3 are not equal");
        }
    }
}
