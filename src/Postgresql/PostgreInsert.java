package Postgresql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PostgreInsert {
	
	
	   public static void main(String args[]) throws SQLException, ClassNotFoundException {
		   Class.forName("org.postgresql.Driver");
	        // String url="jdbc:postgresql://localhost:5432/postgres";
	        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "8991");
	        System.out.println("conn");
	        Statement sts=con.createStatement();
	        String sql = "INSERT INTO EmployeeDet (ID,NAME) "
	                + "VALUES (1, 'Paul');";
	             sts.executeUpdate(sql);

	        
	        //	System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         //  System.out.println(name);
	        
	             con.close();
	        }

	     
	      // System.out.println( e.getClass().getName()+": "+ e.getMessage()));
	   
	    }

