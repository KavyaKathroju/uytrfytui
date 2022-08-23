import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.util.Properties;


public class Annotations {
	public static void main(String[] args) throws IOException {
		
		Properties obj=readPropertiesFile("EmployeeDetails");
		System.out.println("Employee name:"+obj.getProperty("EmployeeName"));
		System.out.println("Employee ID:"+obj.getProperty("EmployeeID"));
		System.out.println("Employee Salary:"+obj.getProperty("EmployeeSalary"));
		
		
	}

	private static Properties readPropertiesFile(String string) throws IOException {
		FileReader read=null;
		Properties obj=null;
		
		try {
			read=new FileReader("EmployeeDetails");
			obj=new Properties();
			obj.load(read);
		}
		finally {
			read.close();
		}
		
	
		return obj;
	}
}