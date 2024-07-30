package javaio;

import java.io.*;

public class ReadTextFromFile {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("example.txt");
            int data;

            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }

            inputStream.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
