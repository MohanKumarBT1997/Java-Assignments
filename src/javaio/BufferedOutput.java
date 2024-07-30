package javaio;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutput {
    public static void main(String[] args) {
        String filePath = "example.txt";
        String text = "Hello, World!"; 

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            bos.write(text.getBytes());
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
