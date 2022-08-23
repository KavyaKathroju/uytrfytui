package Task2;

public class Decrypt {
	public static void main(String[] args) {
		String str="Gor Pcog < JctujcGor KF < 2234Tqng < Uqhvyctg Gpikpggt";
		int i=0;
		String C=" ";
		while(i<str.length()) {
			int CV=str.charAt(i);
			if(CV != ' ') {
				C=String.valueOf((char)(CV-2));
				System.out.print(C);
			}
			else {
				System.out.print(" ");
			}
			
			i++;
		}
		
	}
	}

