import java.io.*;
import java.util.Scanner;

class ReadFile{
	public static void main(String[] args) throws FileNotFoundException {
		
     File file=new File("C:\\Users\\admin\\Downloads\\textfile.txt");
     Scanner s=new Scanner(file);
	
	
		
			System.out.println(s.next());
			System.out.println(s.next());
			
}
	
}