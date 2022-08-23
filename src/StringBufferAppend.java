
public class StringBufferAppend {
	public static void main(String[] args) {
		StringBuffer S=new StringBuffer("Welcome");
		S.append(" "+"Kavya");
		System.out.println(S);
		S.insert(1,"Team");
		System.out.println(S);
		S.replace(2, 5, "Hello");
		System.out.println(S);
		S.delete(7, 14);
		System.out.println(S);
		S.reverse();
		System.out.println(S);
		System.out.println(S.capacity());
	}
	

}
