package projekt_1_JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Task_1_JDBC_Connection {

    public static final String DEFAULT_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DEFAULT_URL = "jdbc:mysql://localhost:3306/ludziska";
    public static final String DEFAULT_USER = "root";
    public static final String DEFAULT_PASS = "root";


    public static void main(String[] args) {

        Connection connection = createConnection(DEFAULT_DRIVER, DEFAULT_URL, DEFAULT_USER, DEFAULT_PASS);
        try {
            if (connection != null) {
                DatabaseMetaData databaseMetaData = connection.getMetaData();
                System.out.println(databaseMetaData.getDatabaseProductName());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private static Connection createConnection(String driver, String url, String user, String pass) {

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
