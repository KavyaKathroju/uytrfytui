package Task2;

public class Encrypt {
	public static void main(String[] args) {
		String str="apple is not good for health";
		int i=0;
		String C=" ";
		while(i<str.length()) {
			int CV=str.charAt(i);
			if(CV != ' ') {
				C=String.valueOf((char)(CV+1));
				System.out.print(C);
			}
			else {
				System.out.print(" ");
			}
			
			i++;
		}
		
	}

}
