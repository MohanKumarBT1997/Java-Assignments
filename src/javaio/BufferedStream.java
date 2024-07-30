package javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedStream {
    public static void main(String[] args) {
        String filePath = "example.txt"; 
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                String text = new String(buffer, 0, bytesRead);
                System.out.print(text);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
