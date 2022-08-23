package Task2;

public class RepeatedCharacter {
	public static void main(String[] args) {
		String str="good morning";
		String S=str.toLowerCase();
		char[] S1=S.toCharArray();
		
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<S1.length;i++) {
				if(ch==S1[i]) {
					count++;
				}
			}
			if(count>0)
				System.out.println(ch+" "+"="+" "+count);
		}
		
		
	}
}