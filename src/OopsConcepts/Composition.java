package OopsConcepts;

class Employee{
	private String role;
	private int id;
	private long salary;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}

class Person{
	private Employee E;
	   
    public Person(){
        this.E=new Employee();
        E.setSalary(20000L);
    }
    public long getSalary() {
        return E.getSalary();
    }
	
}
public class Composition {
	public static void main(String[] args) {
		Person per1=new Person();
		long Salary= per1.getSalary();
		System.out.println("Salary of per1 is: "+Salary);
		
	}

}
