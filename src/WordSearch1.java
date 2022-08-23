
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class WordSearch1 {

	static Map<String, LinkedList<String>> searchMap = new HashMap<>();

	public static void main(String[] args) throws IOException {

		FileReader read=new FileReader("C:\\Users\\admin\\Downloads\\kavya1.txt");
		BufferedReader b=new BufferedReader(read);
		Scanner scr=new Scanner(b);
		
		String input="";
		
		while(scr.hasNextLine()) {
		input =input+" "+scr.nextLine();
		}
		String[] words = input.split(" "); // today
		for (int a = 0; a < words.length; a++) {
			addWord(words[a]);
		}
		printList();
	}

	private static void addWord(String word) {
		// apple
		if(word.length()>1) {
			
		
		String key = word.substring(0, 2);
		if (!searchMap.containsKey(key)) {
			searchMap.put(key, new LinkedList<String>());
		}
		// apple
		searchMap.get(key).add(word);
	}}

	private static void printList() {
		for (String iKey : searchMap.keySet()) {
			System.out.println(iKey +": "+searchMap.get(iKey).toString());
		}
	}

}