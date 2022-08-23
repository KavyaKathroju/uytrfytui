
public class Test4 {
	public static void main(String[] args) {
		String Accounttype="student";
		
		switch(Accounttype)
		{
		
		case("student"):
			System.out.println("minimum balance is 500");
		break;
		case("Employee"):
			System.out.println("minimum balance is 1000");
		break;
		case("business"):
			System.out.println("minimum balance is 2000");
		break;
		case("pension"):
			System.out.println("minimum balance is 0");
		break;
		default:
			System.out.println("Not valid");
		break;
			
		}
		
		
		}
	}


