package Postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Task1F3 {
	public static void main(String args[]) {
	      Connection c = null;
	      Statement statement = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/postgres",
	            "postgres", "8991");
	         c.setAutoCommit(false);
	         
	         String sql = "INSERT INTO userdetails (username, password, fullname, email) VALUES (?, ?, ?, ?)";
	         PreparedStatement statement1 = c.prepareStatement(sql);
	         statement1.setString(1, "kavya");
	         statement1.setString(2, "secretpass");
	         statement1.setString(3, "Kathroju Kavya");
	         statement1.setString(4, "kavya.kathroju@kanerika.com");
	         
	         int rowsInserted = statement1.executeUpdate();
	         
	         statement1.close();
	         c.commit();
	         c.close();
	          }
	      catch (Exception e) {
		         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		         System.exit(0);
		      }
	      System.out.println("a new user details entered successfully");
}
	
}
