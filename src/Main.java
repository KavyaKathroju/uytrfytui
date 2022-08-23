import java.io.IOException;

//import java.lang.reflect.Field;


public class Main {
	public static void main(String args[]) throws IOException,Exception{
		
		Employee employee = new Employee(53700,"Kavya",2342);
		Test test=new Test();
		String s=test.convert(employee);
		

		System.out.println(employee.getEmployeeId() + " " + employee.getEmployeeName() + " " + employee.getEmployeeSalary());
		
	}
	
}
