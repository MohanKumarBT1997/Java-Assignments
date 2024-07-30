package strings;

public class SplitDemo {
    public static void main(String[] args) {
        String str = "apple,banana,orange,grape";

        // Split on a comma delimiter
        String[] fruits = str.split(",");
        System.out.println("Split on comma:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Split on a whitespace delimiter
        str = "Hello World Java";
        String[] words = str.split("\\s+");
        System.out.println("Split on whitespace:");
        for (String word : words) {
            System.out.println(word);
        }

    }
}
