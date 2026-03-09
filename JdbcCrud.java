import java.sql.*;

public class JdbcCrud {

    // ─── DB Connection ──────────────────────────────────────────────────────────
    static final String URL  = "jdbc:mysql://localhost:3306/formdb";
    static final String USER = "root";
    static final String PASS = "1234";

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // ─── CREATE TABLE ───────────────────────────────────────────────────────────
    static void createTable() throws SQLException {
        String sql = """
            CREATE TABLE IF NOT EXISTS students (
                id    INT AUTO_INCREMENT PRIMARY KEY,
                name  VARCHAR(100) NOT NULL,
                grade VARCHAR(5)   NOT NULL
            )
            """;
        try (Connection con = getConnection();
             Statement  st  = con.createStatement()) {
            st.execute(sql);
            System.out.println("Table 'students' created.");
        }
    }

    // ─── CREATE (Insert) ─────────────────────────────────────────────────────────
    static int insertStudent(String name, String grade) throws SQLException {
        String sql = "INSERT INTO students (name, grade) VALUES (?, ?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, name);
            ps.setString(2, grade);
            ps.executeUpdate();
            ResultSet keys = ps.getGeneratedKeys();
            int id = keys.next() ? keys.getInt(1) : -1;
            System.out.printf("Inserted → id=%d, name=%s, grade=%s%n", id, name, grade);
            return id;
        }
    }

    // ─── READ (Select All) ───────────────────────────────────────────────────────
    static void readAllStudents() throws SQLException {
        String sql = "SELECT * FROM students";
        try (Connection con = getConnection();
             Statement  st  = con.createStatement();
             ResultSet  rs  = st.executeQuery(sql)) {
            System.out.println("\nAll Students:");
            System.out.println("┌────┬──────────────────────┬───────┐");
            System.out.println("│ ID │ Name                 │ Grade │");
            System.out.println("├────┼──────────────────────┼───────┤");
            while (rs.next()) {
                System.out.printf("│ %-2d │ %-20s │ %-5s │%n",
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("grade"));
            }
            System.out.println("└────┴──────────────────────┴───────┘");
        }
    }

    // ─── READ (Select by ID) ─────────────────────────────────────────────────────
    static void readStudentById(int id) throws SQLException {
        String sql = "SELECT * FROM students WHERE id = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.printf("Found → id=%d, name=%s, grade=%s%n",
                    rs.getInt("id"), rs.getString("name"), rs.getString("grade"));
            } else {
                System.out.println("Student with id=" + id + " not found.");
            }
        }
    }

    // ─── UPDATE ──────────────────────────────────────────────────────────────────
    static void updateStudent(int id, String newName, String newGrade) throws SQLException {
        String sql = "UPDATE students SET name = ?, grade = ? WHERE id = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, newName);
            ps.setString(2, newGrade);
            ps.setInt(3, id);
            int rows = ps.executeUpdate();
            System.out.printf("Updated %d row(s) → id=%d, name=%s, grade=%s%n",
                rows, id, newName, newGrade);
        }
    }

    // ─── DELETE ──────────────────────────────────────────────────────────────────
    static void deleteStudent(int id) throws SQLException {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.printf("Deleted %d row(s) with id=%d%n", rows, id);
        }
    }

    // ─── MAIN ────────────────────────────────────────────────────────────────────
    public static void main(String[] args) throws Exception {
        // Load MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        createTable();

        System.out.println("\n--- INSERT ---");
        int id1 = insertStudent("tinae",   "A");
        int id2 = insertStudent("Betcy",     "B+");
        int id3 = insertStudent("Charm", "A-");

        System.out.println("\n--- READ ALL ---");
        readAllStudents();

        System.out.println("\n--- READ BY ID ---");
        readStudentById(id2);

        System.out.println("\n--- UPDATE ---");
        updateStudent(id2, "Bob Smith", "A+");
        readAllStudents();

        System.out.println("\n--- DELETE ---");
        deleteStudent(id3);
        readAllStudents();
    }
}