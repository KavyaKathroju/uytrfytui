import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		
		List<Integer> values=new ArrayList<Integer>();
		
		values.add(5);
		values.add(78);
		values.add(9);
		
		Collections.sort(values);
		
		//Iterator i= values.iterator();     //using Iterator
		//while(i.hasNext()) {
			//System.out.println(i.next());
		
		//for(int i:values) {                  //enhance forloop
			//System.out.println(i);
		
		values.forEach(System.out::println);    // Stream Api :: Lambda Expression
		}
			
		}
	


