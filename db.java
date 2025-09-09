import java.sql.*;

public class Test {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/example"; 
        String user = "root";   
        String password = "";  // put your MySQL password if any

        try {
            // Load MySQL JDBC Driver (optional in new versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Try to connect
            Connection conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("✅ Connection successful!");
                Statement stmt = conn.createStatement();

                // ✅ Execute Query
                ResultSet rs = stmt.executeQuery("SELECT * FROM students");

                // ✅ Process ResultSet
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    System.out.println(id + " | " + name + " | " + age);
                }
                conn.close();
            } else {
                System.out.println("❌ Connection failed!");
            }

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}





✅ Connection successful!
1 | Alice | 20
2 | Bob | 22
3 | Charlie | 21

