package strings;

public class RegexMatchDemo {
    public static void main(String[] args) {
        String regex = "Java.*";
        String input = "Java is fun";

        if (input.matches(regex)) {
            System.out.println("The string matches the regex");
        } else {
            System.out.println("The string does not match the regex");
        }
    }
}