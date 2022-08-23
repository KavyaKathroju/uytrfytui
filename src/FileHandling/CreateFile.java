package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		
			File obj=new File("Documents\\textfile1.txt");
			
		if(obj.exists()) {
			System.out.println("file already exist");
		}
			else {
				obj.createNewFile();
				System.out.println("file created");
			}
		}
		
		

}
