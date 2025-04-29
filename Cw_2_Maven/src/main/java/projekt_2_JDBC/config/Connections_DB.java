package projekt_2_JDBC.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections_DB {

    public static Connection createConnection(String driver, String url, String user, String pass) {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
