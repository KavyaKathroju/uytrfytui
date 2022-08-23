package Polymorphism;

public class CompileTimeP {
	public static void main(String[] args) {
		one obj=new one();
		obj.show();
		
	}

}
class one{
	
	public void show() {
		System.out.println("hello");
	}
	public void show(int i) {
		System.out.println("hello"+" "+i);
	}
	public void show(double d) {
		System.out.println(d);
		
	}
	
}