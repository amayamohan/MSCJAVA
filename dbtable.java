import java.sql.*; 
public class EmployeeDBExample {
	public static void main(String[] args) { 
		// JDBC connection details 
		String url = "jdbc:mysql://localhost:3306/"; // connect to server, no DB yet 
		String user = "root";    // your MySQL username 
		String password = ""; // your MySQL password 
		try { 
		// 1. Load MySQL JDBC Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2. Connect to MySQL server 
		Connection con = DriverManager.getConnection(url, user, password); 
		System.out.println("Connected to MySQL Server!"); 
		// 3. Create a Statement 
		Statement stmt = con.createStatement(); 
		// 4. Create Database 
		String dbName = "EmployeeDB"; 
		String createDB = "CREATE DATABASE IF NOT EXISTS " + dbName; 
		stmt.executeUpdate(createDB); 
		System.out.println(" Database created: " + dbName); 
		// 5. Connect to EmployeeDB 
		con = DriverManager.getConnection(url + dbName, user, password); 
		stmt = con.createStatement(); 
		// 6. Create employee table 
		String createTable = "CREATE TABLE IF NOT EXISTS employee (" + 
		"emp_id INT PRIMARY KEY AUTO_INCREMENT, " + 
		"emp_name VARCHAR(100) NOT NULL, " + 
		"designation VARCHAR(50), " + 
		"salary DECIMAL(10,2))"; 
		stmt.executeUpdate(createTable); 
		System.out.println("Table 'employee' created successfully!"); 
		// 7. Close connection 
		con.close(); 
		} catch (Exception e) { 
		e.printStackTrace(); 

}
	}
}import java.sql.*; 
public class EmployeeDBExample {
	public static void main(String[] args) { 
		// JDBC connection details 
		String url = "jdbc:mysql://localhost:3306/"; // connect to server, no DB yet 
		String user = "root";    // your MySQL username 
		String password = ""; // your MySQL password 
		try { 
		// 1. Load MySQL JDBC Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2. Connect to MySQL server 
		Connection con = DriverManager.getConnection(url, user, password); 
		System.out.println("Connected to MySQL Server!"); 
		// 3. Create a Statement 
		Statement stmt = con.createStatement(); 
		// 4. Create Database 
		String dbName = "EmployeeDB"; 
		String createDB = "CREATE DATABASE IF NOT EXISTS " + dbName; 
		stmt.executeUpdate(createDB); 
		System.out.println(" Database created: " + dbName); 
		// 5. Connect to EmployeeDB 
		con = DriverManager.getConnection(url + dbName, user, password); 
		stmt = con.createStatement(); 
		// 6. Create employee table 
		String createTable = "CREATE TABLE IF NOT EXISTS employee (" + 
		"emp_id INT PRIMARY KEY AUTO_INCREMENT, " + 
		"emp_name VARCHAR(100) NOT NULL, " + 
		"designation VARCHAR(50), " + 
		"salary DECIMAL(10,2))"; 
		stmt.executeUpdate(createTable); 
		System.out.println("Table 'employee' created successfully!"); 
		// 7. Close connection 
		con.close(); 
		} catch (Exception e) { 
		e.printStackTrace(); 

}
	}
}



Connected to MySQL Server!
 Database created: EmployeeDB
Table 'employee' created successfully!