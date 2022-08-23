import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ExpressionEvaluate {
public static void main(String[] args) throws IOException  {
		
	 Map<String, LinkedList<String>> searchMap = new HashMap<>();

		
		FileReader read=new FileReader("C:\\\\Users\\\\admin\\\\Downloads\\\\JavaRegex.txt");
		List<String> values=new LinkedList();
		Scanner scan=new Scanner(read);
		
		while(scan.hasNext()) {
			values.add(scan.next());
		}
			
			if((values.contains("Java")|values.contains("Regex"))|values.contains("kav")) {
			System.out.print("True");
			}
			else {
				System.out.print("False");
			}
				
			
		
		read.close();
		scan.close();
	}
	

}

