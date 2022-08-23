
public class Employee {
	    private int EmployeeSalary;
	      
	    @Similar(value="Name")
	    
	    private String EmployeeName;
	    
	    private int EmployeeId;
	    
		public Employee(int employeeSalary, String employeeName, int employeeId) {
			super();
			EmployeeSalary = employeeSalary;
			EmployeeName = employeeName;
			EmployeeId = employeeId;
		}

		public int getEmployeeSalary() {
			return EmployeeSalary;
		}

		public void setEmployeeSalary(int employeeSalary) {
			EmployeeSalary = employeeSalary;
		}

		public String getEmployeeName() {
			return EmployeeName;
		}

		public void setEmployeeName(String employeeName) {
			EmployeeName = employeeName;
		}

		public int getEmployeeId() {
             return EmployeeId;
		}

		public void setEmployeeId(int  employeeId) {
			EmployeeId = employeeId;
		}
		
}
