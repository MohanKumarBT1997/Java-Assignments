package javaio;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) {
        String filePath = "config.properties"; 

        try (FileInputStream input = new FileInputStream(filePath)) {
            Properties prop = new Properties();
            prop.load(input);

            String username = prop.getProperty("username");
            String password = prop.getProperty("password");
            String url = prop.getProperty("url");

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("URL: " + url);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
