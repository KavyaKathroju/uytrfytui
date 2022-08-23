package Postgresql;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching1 {
	public static void main(String[] args) throws FileNotFoundException {
		 Map<String, LinkedList<String>> searchMap = new HashMap<>();

		
		
		        FileReader read = new FileReader("C:\\\\Users\\\\admin\\\\Downloads\\\\JavaRegex.txt"); 
	List<String> values=new LinkedList();
	Scanner scan=new Scanner(read);
	
	//while(scan.hasNext()) {
		//values.add(scan.next());
	//}
	String regexPattern=scan.nextLine();
	  //String[] split = pattern.split(regexPattern);
	//System.out.println(regexPattern);	

Pattern pattern=Pattern.compile(regexPattern);
Matcher matcher=pattern.matcher("Java");
matcher.matches();
String[] split= pattern.split(regexPattern);
boolean found=false;
while(matcher.find()) {
	System.out.println(found);
	 found=true;
}

if(!found) {
	System.out.println(found);
//}

}
}}


