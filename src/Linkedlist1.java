import java.util.*;
public class Linkedlist1 {
	public static void main(String[] args) {
		

	LinkedList<String> l = new LinkedList();
	
	l.add("linked");
	l.add("list");
	
	l.addFirst("new");
	l.add(1,"one");
	
	System.out.println("Initial list is"+" "+l);
	l.remove(1);
	System.out.println("Final list is"+" "+l);
	l.set(2, "list1");
	System.out.println(l);
	

}
}
