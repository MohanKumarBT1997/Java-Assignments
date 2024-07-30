package strings;

public class TrimDemo {
    public static void main(String[] args) {
        String str = "   Hello World   ";

        System.out.println("Before trimming: \"" + str + "\"");
        System.out.println("Length: " + str.length());

        str = str.trim();

        System.out.println("After trimming: \"" + str + "\"");
        System.out.println("Length: " + str.length());
    }
}
