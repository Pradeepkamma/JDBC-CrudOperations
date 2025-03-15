import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUsingMethods {
	private static final String url = "jdbc:mysql://localhost:3306/jdbcdemo"; 
	private static final String username = "root";  
	private static final String password = "admin";
	
	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(url,username,password);
		return connection;
	}
	
	public static void insert() throws SQLException {
		Connection con = getConnection();
		String insertQuery = "insert into student(id,name,email) values(?,?,?)";
		//System.out.println(insertQuery);
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setInt(1,102);
		ps.setString(2, "Dharani");
		ps.setString(3, "def@gmail.com");
		int rowsUpdated = ps.executeUpdate();
		System.out.println("Rows affected: "+ rowsUpdated);
		
	}
	
	public static void update() throws SQLException {
		Connection con = getConnection();
		String updateQuery = "update student set name='PRADEEP' where id =101";
		PreparedStatement ps = con.prepareStatement(updateQuery);
		int rowsUpdated = ps.executeUpdate();
		System.out.println("Rows affected: "+ rowsUpdated);
		
	}
	
	public static void delete() throws SQLException {
		Connection con = getConnection();
		String deleteQuery = "delete from student where id = 102";
		PreparedStatement ps = con.prepareStatement(deleteQuery);
		int rowsUpdated = ps.executeUpdate();
		System.out.println("Rows affected: "+ rowsUpdated);
	}
	public static void main(String[] args) throws SQLException {
         insert();
         
	}

}

