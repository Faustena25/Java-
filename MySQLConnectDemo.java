
//https://www.youtube.com/watch?v=Y0rnjz_g82Y

import java.sql.*;

public class MySQLConnectDemo {
    public static void main(String[] args) {

        // Database credentials
        String url = "jdbc:mysql://localhost:3306/formdb"; // replace your_db_name
        String user = "root";       // replace your MySQL username
        String pass = "1234";  // replace your MySQL password

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1) Load and register driver (optional in newer Java versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2) Establish Connection
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected successfully!");

            stmt = conn.createStatement();

            // 3) Create a sample table (if not exists)
            /*String createTable = "CREATE TABLE IF NOT EXISTS student (" +
                                 "id INT AUTO_INCREMENT PRIMARY KEY," +
                                 "name VARCHAR(100), " +
                                 "age INT)";
            stmt.executeUpdate(createTable);/* */

            // 4) Insert data into table
           /* String insert = "INSERT INTO student (name, age) VALUES " +
                            "('Amit', 21), ('Neha', 23)";
            stmt.executeUpdate(insert);

            System.out.println("Data inserted!");*/

            // 5) Fetch and display data
            String selectQuery = "SELECT * FROM users";
            rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                System.out.println(
                    rs.getString("id") + " | " +
                    rs.getString("fullname") + " | " +
                    rs.getInt("email")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception ignored) {}
            try { if (stmt != null) stmt.close(); } catch (Exception ignored) {}
            try { if (conn != null) conn.close(); } catch (Exception ignored) {}
        }
    }
}