package OopsConcepts;

abstract class Kanerika {
	abstract int getSalary();
	public static void main(String[] args) {
		Kanerika S=new Employee1();
		System.out.println("Salary of Emp1 is:"+ S.getSalary());
		Kanerika S1=new Employee2();
		System.out.println("Salary of Emp2 is:"+ S1.getSalary());
	}
}

class Employee1 extends Kanerika{

	int getSalary() {
		return 15000;
	}
}
class Employee2 extends Kanerika{
	int getSalary() {
		return 20000;
	}
}
