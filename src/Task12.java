import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) throws IOException {
		
		
		
		FileReader read=new FileReader("C:\\Users\\admin\\Downloads\\emp.txt");
		Collection values=new ArrayList();
		Scanner scan=new Scanner(read);
		
		while(scan.hasNext()) {
			values.add(scan.next());
		}
			
			if((values.contains("Harsha")|values.contains("0012"))&values.contains("kav")) {
			System.out.print("True");
			}
			else {
				System.out.print("False");
			}
				
			
		
		read.close();
		scan.close();
	}
	

}
