package strings;

public class StringCreationDemo {
    public static void main(String[] args) {
        //  Using a String Literal
        String str1 = "Hello, World!";
        System.out.println("Method 1: " + str1);

        //  Using the `new` Keyword
        String str2 = new String("Hello, World!");
        System.out.println("Method 2: " + str2);

        //  Using the `String` Constructor with a Character Array
        char[] chars = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        String str3 = new String(chars);
        System.out.println("Method 3: " + str3);

        //  Using the `String` Constructor with a Byte Array
        byte[] bytes = "Hello, World!".getBytes();
        String str4 = new String(bytes);
        System.out.println("Method 4: " + str4);

        //  Using the `StringBuilder` or `StringBuffer` Class
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("World!");
        String str6 = sb.toString();
        System.out.println("Method 6: " + str6);

        //  Using the `format()` Method
        String str7 = String.format("Hello, %s!", "World");
        System.out.println("Method 7: " + str7);
    }
}
