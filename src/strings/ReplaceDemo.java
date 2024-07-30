package strings;

public class ReplaceDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";

        String newStr = str.replace('o', 'x');
        System.out.println("Replace 'o' with 'x': " + newStr);

        newStr = str.replace("World", "Java");
        System.out.println("Replace 'World' with 'Java': " + newStr);

        str = "Hello, hello, hello!";
        newStr = str.replace("hello", "hi");
        System.out.println("Replace all 'hello' with 'hi': " + newStr);

    }
}
