package naresh.biz.IG1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_demo 
{
	public static void main(String arg[])
	{
	// Register JDBC driver
	
	// Populate City table
	try 
	{
		Class.forName("org.apache.ignite.IgniteJdbcThinDriver");

		// Open JDBC connection
		Connection conn = DriverManager.getConnection("jdbc:ignite:thin://0.0.42.48/");
		PreparedStatement stmt =conn.prepareStatement("INSERT INTO City (id, Name) VALUES (?, ?)" );
		 

	    stmt.setLong(1, 1L);
	    stmt.setString(2, "Forest Hill");
	    stmt.executeUpdate();

	    stmt.setLong(1, 2L);
	    stmt.setString(2, "Denver");
	    stmt.executeUpdate();

	    stmt.setLong(1, 3L);
	    stmt.setString(2, "St. Petersburg");
	    stmt.executeUpdate();
	}
	catch(Exception ex)
	{
		
		System.out.println("Exception "+ex.getMessage());
		
	}
	finally 
	{
	
	}
      /* stmt =conn.prepareStatement("INSERT INTO Person (id, name, city_id) VALUES (?, ?, ?)");
	// Populate Person table
	try {
		

	    stmt.setLong(1, 1L);
	    stmt.setString(2, "John Doe");
	    stmt.setLong(3, 3L);
	    stmt.executeUpdate();

	    stmt.setLong(1, 2L);
	    stmt.setString(2, "Jane Roe");
	    stmt.setLong(3, 2L);
	    stmt.executeUpdate();

	    stmt.setLong(1, 3L);
	    stmt.setString(2, "Mary Major");
	    stmt.setLong(3, 1L);
	    stmt.executeUpdate();

	    stmt.setLong(1, 4L);
	    stmt.setString(2, "Richard Miles");
	    stmt.setLong(3, 2L);
	    stmt.executeUpdate();
	}
	finally
	{
		
		
	}
*/
}
}