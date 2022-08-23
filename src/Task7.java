import java.util.*;
public class Task7 {
	public static void main(String[] args) {
	Task7 obj=new Task7();
	obj.v();
	
	
}
public void v() {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter word:");
	
	
	String[] strC=new String[676];
	char A1 = ' ';
	char A2 = ' ';
	int i=0;

	for( A1='a';A1<='z';++A1) {
		for(A2='a';A2<='z';++A2) {
		
	
		strC[i] = String.valueOf(A1+""+A2);
		
		
		i++;
		}
	}
	
	String S="";
	 S=sc.nextLine();
	 
	 S=S.substring(0,2);
	 
	for(int j = 0; j < strC.length; j++)
    {   
        if (strC[j].equalsIgnoreCase(S)) {
        	System.out.println(j);
        	
            
    }
	
	
}
}
}

