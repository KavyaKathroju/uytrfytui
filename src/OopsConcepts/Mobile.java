package OopsConcepts;

abstract class Mobile {
	abstract void call();
	public static void main(String[] args) {
		Mobile obj=new Samsung();
		obj.call();
	
}
		
	}
	class Samsung extends Mobile{
		void call() {
			System.out.println("calling");
		}
		
	
	

}
