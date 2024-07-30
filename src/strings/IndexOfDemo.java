package strings;

public class IndexOfDemo {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        int index = originalString.indexOf("World");
        System.out.println("Index of 'World': " + index);

        index = originalString.indexOf("Hello");
        System.out.println("Index of 'Hello': " + index);

        index = originalString.indexOf("Universe");
        System.out.println("Index of 'Universe': " + index);

        index = originalString.indexOf(",");
        System.out.println("Index of ',': " + index);

        index = originalString.indexOf("World", 5);
        System.out.println("Index of 'World' starting from 5: " + index);

        index = originalString.lastIndexOf("World");
        System.out.println("Last index of 'World': " + index);
    }
}
