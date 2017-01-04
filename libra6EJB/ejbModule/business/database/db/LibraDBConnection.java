
package business.database.db;

import java.sql.*;


public class LibraDBConnection {

	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://192.168.1.80/libra6?user=root&password=redhat";
	Connection conn = null;


	public Connection openConnection()  throws Exception 	{
	
      Class.forName(driver).newInstance();
      conn = DriverManager.getConnection(url);

	return conn; 

	}

	public void closeConnection() throws Exception {
	
	conn.close() ; 

	}

}

