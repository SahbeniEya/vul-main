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
import java.sql.Statement;
import java.sql.SQLException;
import javax.servlet.jsp.JspWriter;
import org.apache.commons.text.StringEscapeUtils;

// Assuming you're using JSP and JSTL

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
}\nStatement stmt = null;
ResultSet rs = null;

try {
    stmt = conn.createStatement();
    rs = stmt.executeQuery(query);
java
import java.text.Normalizer;
import java.util.Formatter;
import java.util.regex.Pattern;

// XSS Vulnerability (Simulated for web context)
String comment = "<script>alert('XSS');</script>";
comment = Normalizer.normalize(comment, Normalizer.Form.NFD)
        .replaceAll("[^\\p{ASCII}]", "")
        .replaceAll("(<[^>]*>)", "");
System.out.println("Sanitized User comment: " + comment);\n    while (rs.next()) {
        String username = rs.getString("username");
        String sanitizedUsername = StringEscapeUtils.escapeHtml4(username);
        out.println("User: " + sanitizedUsername);
    }
} catch (SQLException e) {
    e.printStackTrace();
} finally {
    try {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}\nimport java.sql.SQLException;
import javax.servlet.jsp.JspWriter;
import org.apache.commons.text.StringEscapeUtils;
        }

        // Command Injection Vulnerability
        java
import java.io.BufferedReader;
import java.io.InputStreamReader;

String filename = args[1];
Process process;

        java
import java.text.Normalizer;
import java.util.Formatter;
import java.util.regex.Pattern;

