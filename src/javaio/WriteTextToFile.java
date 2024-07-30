package javaio;

import java.io.*;

public class WriteTextToFile {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("example.txt");
            String text = "Hello, World!";
            outputStream.write(text.getBytes());
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
