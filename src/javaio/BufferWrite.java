package javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {
    public static void main(String[] args) {
        String filePath = "example.txt";
        String text = "Hello, World!"; 

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(text);
            writer.newLine(); 
            writer.write("This is another line of text.");
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}