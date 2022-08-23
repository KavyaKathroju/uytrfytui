package Polymorphism;

public class RunTimeP {
	public static void main(String[] args) {
		B obj=new B();
		obj.show();
		
	}

}
class A {
	public void show() {
		System.out.println("Hello");
	}
}
class B extends A{
	public void show() {
		System.out.println("Hii");
	}
}
