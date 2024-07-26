package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    public static Connection getCon() {
        try {
            // Registering the JDBC driver is optional since JDBC 4.0
            // Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/bms";
            String user = "root";
            String password = "kali";

            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (SQLException e) {
            // Handle any SQL errors
            e.printStackTrace();
            return null; // Or handle the exception as per your application's requirement
        }
    }
}
