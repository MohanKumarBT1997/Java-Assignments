package javaio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        String filePath = "example.txt"; 
        String text = "Hello, World!"; 

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
