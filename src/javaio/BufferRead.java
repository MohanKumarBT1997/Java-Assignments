package javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {
    public static void main(String[] args) {
        String filePath = "example.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}