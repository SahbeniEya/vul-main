import java.sql.*;
import java.io.*;

public class VulnerableApp {
    public static void main(String[] args) {
        // SQL Injection Vulnerability
        String userInput = args[0];
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("User: " + rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Command Injection Vulnerability
        String filename = args[1];
        try {
            Runtime.getRuntime().exec("sh -c ls " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // XSS Vulnerability (Simulated for web context)
        String comment = "<script>alert('XSS');</script>";
        System.out.println("User comment: " + comment);  // Simulate response output
    }
}
