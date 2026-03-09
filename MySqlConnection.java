import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnection {
    private String url;
    private String username;
    private String password;
    private Connection connection;

    public MySqlConnection(String url, String username, String password) {
        this.url = "jdbc:mysql://localhost:3306/formdb";
        this.username = "root";
        this.password = "1234";
    }

    public void connect() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL database at " + url);
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }

    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Disconnected from MySQL database at " + url);
            }
        } catch (SQLException e) {
            System.err.println("Disconnection failed: " + e.getMessage());
        }
    }

    public void createTable() {
        String createTableSQL = """
                CREATE TABLE IF NOT EXISTS employees (
                    id         INT AUTO_INCREMENT PRIMARY KEY,
                    name       VARCHAR(100) NOT NULL,
                    department VARCHAR(100) NOT NULL,
                    salary     DECIMAL(10, 2) NOT NULL,
                    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                );
                """;

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(createTableSQL);
            System.out.println("Table 'employees' created successfully.");
        } catch (SQLException e) {
            System.err.println("Create table failed: " + e.getMessage());
        }
    }

    public void insertValues() {
        String insertSQL = """
                INSERT INTO employees (name, department, salary) VALUES
                    ('Alice Johnson', 'Engineering', 95000.00),
                    ('Bob Smith',     'Marketing',   72000.00),
                    ('Carol White',   'HR',          68000.00),
                    ('David Brown',   'Engineering', 105000.00),
                    ('Eva Green',     'Finance',     88000.00);
                """;

        try (Statement stmt = connection.createStatement()) {
            int rows = stmt.executeUpdate(insertSQL);
            System.out.println(rows + " row(s) inserted into 'employees' successfully.");
        } catch (SQLException e) {
            System.err.println("Insert failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        MySqlConnection conn = new MySqlConnection(
                "jdbc:mysql://localhost:3306/formdb", "root", "1234"
        );

        conn.connect();
        conn.createTable();
        conn.insertValues();
        conn.disconnect();
    }
}