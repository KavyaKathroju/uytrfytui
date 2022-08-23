import java.util.Scanner;
public class ConversionSum {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter a sentance:");
	        String input = sc.nextLine();
	            char ch;
	             int output;
	             int output1=0;
	            String s=" ";

	        String words[] = input.split(" ");
	        for(int p=0;p<words.length;p++)
	        {
	            output=0;
	            output1=0;
	        String eachWords =words[p]; 

	        char s1[] = eachWords.toCharArray();

	            for(int i=0;i<s1.length;i++) 
	            {

	               ch =  s1[i]; 
	               if(ch!=32)  
	               {
	               output = (int)ch;  
	               output1 += output;
	               s=String.valueOf(output1);
	                }
	            }
	                if(p>0&&p<words.length)

	                s=" "+s;
	             System.out.print(s);
	        }


	    }

	}
