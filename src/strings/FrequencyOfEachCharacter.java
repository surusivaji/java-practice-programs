package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FrequencyOfEachCharacter {
	
	public static void frequencyOfCharacter(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		Set<Entry<Character, Integer>> set = map.entrySet();
		for (Entry<Character, Integer> entry : set) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
	}
	
	public static void occuranceOfEachCharacter(String str) {
		int[] occurance = new int[str.length()];
		int visited = -1;
		for (int i=0; i<str.length(); i++) {
			int count = 1;
			char ch1 = str.charAt(i);
			for (int j=i+1; j<str.length(); j++) {
				char ch2 = str.charAt(j);
				if (ch1==ch2) {
					count++;
					occurance[j] = visited;
				}
			}
			if (occurance[i]!=visited) {
				occurance[i] = count;
			}
		}
		
		for (int i=0; i<str.length(); i++) {
			if (occurance[i]!=visited) {
				System.out.println(str.charAt(i)+" ->"+occurance[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = scanner.next();
		System.out.println("Frequencies");
		frequencyOfCharacter(str);
		scanner.close();
	}

}
