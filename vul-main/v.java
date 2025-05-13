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
            java
import java.sql.ResultSet;
java
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.net.URLEncoder;

// ...

String sanitizedUsername = URLEncoder.encode(rs.getString("username"), "UTF-8");
java
import java.io.BufferedReader;
import java.io.InputStreamReader;

String filename = args[1];
Process process;
try {
    process = Runtime.getRuntime().exec("ls " + filename);
    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}\ntry {
    ResultSet rs = stmt.executeQuery(query);
    while (rs.next()) {
        System.out.println("User: " + sanitizedUsername);
    }
} catch (SQLException e) {
java
import java.net.URLDecoder;

// XSS Vulnerability (Simulated for web context)
String comment = "<script>alert('XSS');</script>";
String safeComment = URLDecoder.decode(comment, "UTF-8").replaceAll("\\<.*?\\>", "");
System.out.println("User comment: " + safeComment);  // Simulate response output\n}\nimport java.sql.Statement;
import java.net.URLEncoder;

        }

        // Command Injection Vulnerability
        java
import java.io.BufferedReader;
import java.io.InputStreamReader;

String filename = args[1];
Process process;

        java
import java.net.URLDecoder;

// XSS Vulnerability (Simulated for web context)
String comment = "<script>alert('XSS');</script>";
