import java.util.*;
public class Main1 {
	public static void main(String[] args) {
        Stack<String> S = new Stack<String>();
        S.push("K");
        S.push("A");
        S.push("V");
        S.push("Y");
        S.push("A");
        
        System.out.println(S.pop());
        System.out.println(S.pop());
        
        Iterator iterator = S.iterator();
        while(iterator.hasNext()){
                System.out.print(iterator.next() + " "); 
     
        }

}
}
