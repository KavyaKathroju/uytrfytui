import java.util.LinkedList;
import java.util.Scanner;

public class Task13Chat {
	public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<>();
	        System.out.println("lets chat:");
	        
	        while(list.size()>=0)
	        {
	            
	        
	        Scanner sc = new Scanner(System.in);
	        list.add(sc.nextLine());
	          if(list.size()>4)
	          {
	              list.removeFirst();
	          }
	          
	        for(Object o : list)
	        {
	            
	            System.out.println(o);
	        }
	        }
	        
	        
	    
	}

}
