package strings;

public class CaseConversion {
	
    public static void main(String[] args) {
        String originalString = "Hello, World!";

        String uppercaseString = originalString.toUpperCase();
        System.out.println("Uppercase: " + uppercaseString);

        String lowercaseString = originalString.toLowerCase();
        System.out.println("Lowercase: " + lowercaseString);

        String titleCaseString = originalString.substring(0, 1).toUpperCase() + 
        		originalString.substring(1).toLowerCase();
        System.out.println("Title Case: " + titleCaseString);
    }
}
