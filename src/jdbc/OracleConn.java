package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleConn {

	public static void main(String[] args) throws Exception {
		
		// load the JDBC Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Connection Obj
		Connection con = DriverManager.getConnection(
			    "jdbc:oracle:thin:@localhost:1521:orcl","sys as sysdba", "Admin@123");
		
		//JDBC Obj fro Statement
		Statement st = con.createStatement();
		
		//write the query
		String query = "select * from Employees";
		
		//create JDBC ResultSet obj
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
		}
		
		rs.close();
		
		st.close();
		
		con.close();

	}

}
