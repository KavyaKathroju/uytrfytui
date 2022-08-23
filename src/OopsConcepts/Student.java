package OopsConcepts;
public class Student{
	public static void main(String[] args) {
		Test obj=new Test();
		obj.setName("Madhu");
		obj.setRollnumber(1);
		obj.setPercentage(95.5f);
		System.out.println("Student name is"+" "+obj.getName()+"\n"+"student id is"+" "+obj.getRollnumber()+"\n"+"pecentae is"+" "+obj.getPercentage());
	}
}

class Test {
	private String name;
	private int rollnumber;
	private float percentage;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}	
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	}

