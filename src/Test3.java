
public class Test3 {
	public static void main(String[] args) {
		String Accounttype="student" ;
		
		if(Accounttype=="student")
			System.out.println("minimum balance is 500");
		else if(Accounttype=="Employee")
			System.out.println("minimim balance is 1000");
		else if(Accounttype=="business")
			System.out.println("minimum balance is 2000");
		else if(Accounttype=="pnsion")
			System.out.println("minimum balance is 0");
		else
			System.out.println("Invalid");
		
	}

}
