import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EmpDecryption {
    public static void main(String[] args) throws IOException {
		
    	FileReader read=new FileReader("C:\\Users\\admin\\Downloads\\Empdata.txt");
		BufferedReader b=new BufferedReader(read);
		
		PrintWriter write=new PrintWriter("C:\\Users\\admin\\Downloads\\EmpDecryption.txt");
		
		Scanner scr=new Scanner(b);
	
		
		while(scr.hasNextLine()) {
			//System.out.println(scr.nextLine());
			
		
					String str=scr.nextLine();
					int i=0;
					String C=" ";
					String output = "";
					while(i<str.length()) {
						int CV=str.charAt(i);
						if(CV != ' ') {
							C=String.valueOf((char)(CV-1));
							System.out.print(C);
							//write.print(C);
							output=output+C;
							
							
						}
						else {
							
							
							output=output+" ";
						}
						
						i++;
						
						
					}
					System.out.println();
					
					write.println(output);
					
				}	
		write.flush();
		write.close();
		
		b.close();
		
	}
}
