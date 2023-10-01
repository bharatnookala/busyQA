package class2_2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SQLConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		//create a connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3316/lab2","root","AMOD5410H");
		//create a statment
		Statement stmt = conn.createStatement();
		//execute the query
		ResultSet rs = stmt.executeQuery("select * from Persons;");
		//get the results
		while(rs.next()) {
			System.out.println("the index 0 are::::"+rs.getInt(1));
			System.out.println("the index 1 are::::"+rs.getString(2));
			System.out.println("the index 2 are::::"+rs.getInt(3));
		}
		//close the connection
		conn.close();
		

	}

}
