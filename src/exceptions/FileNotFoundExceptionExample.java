package exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("nonExistentFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
