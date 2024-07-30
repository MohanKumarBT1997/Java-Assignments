package exceptions;

import java.sql.*;

public class SQLExceptionGenerator {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "root", "root");
            Statement stmt = conn.createStatement();
            stmt.executeQuery("SELECT * FROM nonexistenttable");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}