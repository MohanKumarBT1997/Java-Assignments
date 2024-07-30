package javaio;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        String filePath = "example.txt";

        try (FileReader reader = new FileReader(filePath)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
