import java.sql.*;
public class Jdbc {
	
	    public static void main(String[] args) throws Exception {



	       Class.forName("org.postgresql.Driver");
	        // String url="jdbc:postgresql://localhost:5432/postgres";
	        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "8991");
	        System.out.println("conn");
	        Statement sts=con.createStatement();
	        String querry="SELECT * FROM public.\"EmployeeDet\"";
	        ResultSet sss =sts.executeQuery(querry);
	        while (sss.next()) {



	           String name = sss.getString("Name")+sss.getInt("ID");
	           System.out.println(name);
	        

	        }

	       con.close();
	    }
}

