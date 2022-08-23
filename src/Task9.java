import java.util.LinkedList;
import java.util.Scanner;
		
public class Task9 {
	public static void main(String[] args) {
		
		

		        String array[] = new String[676];
		        LinkedList list = new LinkedList();
		        LinkedList list2 = new LinkedList();

		        for(int l=0;l<array.length;l++)
		        {
		            list.add(l, null);
		        }

		        int n=0;


		        for(char i='a';i<='z';i++)      
		        {                                 
		            for(char k='a';k<='z';k++)    
		            {
		            array[n]=i+""+k;
		             n++;
		            } 
		         }



		        String input = "apple is good for health"; //apple is good for health
		        String[] words = input.split(" "); //apple

		        for(int a=0;a<words.length;a++)
		        {
		            String words1 = words[a];

		            String words2 = words1.substring(0, 2);
		            int j=0;

		         for( j=0;j<array.length;j++)
		         {
		            String check =array[j];
		            if(check.equalsIgnoreCase(words2))
		            {

		                list.add(j,words1);
		                list2.add(words1);

		                System.out.println("list index of "+words1+ " is : "+list.indexOf(words1));
		                System.out.println("array index of "+ words1+" is : "+j);

		                break;
		            }
		         }
		        }
		        for(int b=0;b<array.length;b++)
		        {
		            System.out.print(array[b]+"    ");
		        }
		        System.out.println();

		        System.out.println(list);

		        System.out.println(list2);

		    }
		}
