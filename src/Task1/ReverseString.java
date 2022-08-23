package Task1;

import java.io.*;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String str="Kanerika",Rstr="";char ch;
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			Rstr=ch+Rstr;
			
		}
		System.out.println(str+" "+":"+" "+Rstr);
	}
	

}
