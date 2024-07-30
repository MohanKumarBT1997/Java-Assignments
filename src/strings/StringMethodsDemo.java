package strings;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "World";

        // equalsIgnoreCase()
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("str1 and str2 are equal (ignoring case)");
        }

        // startsWith()
        if (str1.startsWith("He")) {
            System.out.println("str1 starts with 'He'");
        }

        // endsWith()
        if (str1.endsWith("lo")) {
            System.out.println("str1 ends with 'lo'");
        }

        // compareTo()
        int result = str1.compareTo(str3);
        if (result < 0) {
            System.out.println("str1 comes before str3");
        } else if (result > 0) {
            System.out.println("str1 comes after str3");
        } else {
            System.out.println("str1 is equal to str3");
        }
    }
}
