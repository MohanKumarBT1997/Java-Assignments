package exceptions;

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("nonWritableFile.txt");
            fileOutputStream.write("Hello, World!".getBytes());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}