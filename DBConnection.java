import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public static Connection getConnection() throws SQLException  {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@sowndarya:1521:exim", "sys as sysdba", "password");

		return conn;
	}
	
	public static void main(String[] args) throws Exception  {
		
		Connection conn = getConnection();
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEE");
		
		while ( rs.next() ) {
			
			System.out.println(rs.getString("ENAME"));
			
		}
		rs.close();
		st.close();
		conn.close();
		
		
		
		
	}

}
